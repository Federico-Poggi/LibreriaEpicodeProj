package federicoPoggi.Enteties;

import javax.persistence.*;

import java.security.SecureRandom;

@Entity
@Table(name = "cards")
public class LibraryCard {
    @Id
    @Column(name = "numero_tessera", length = 20)
    private String numeroTessera;
    @OneToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public LibraryCard() {
        this.numeroTessera = randomCardNumGen();
    }





    /*---GETTERS AND SETTERS----*/
    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public String getNumeroTessera() {
        return numeroTessera;
    }


    static String randomCardNumGen(){
        int lenghtCode = 6;
        StringBuilder code=new StringBuilder(lenghtCode);
        SecureRandom sec=new SecureRandom();
        for (int i = 0; i< lenghtCode; i++){
            String carattteri = "ABCDEFGHILMNOPQRSTUVZXWYK1234567890";
            int indexR=sec.nextInt(carattteri.length());
            code.append(carattteri.charAt(indexR));
        }
        return code.toString();
    }
}
