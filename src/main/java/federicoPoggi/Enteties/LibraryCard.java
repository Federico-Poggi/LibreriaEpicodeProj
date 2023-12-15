package federicoPoggi.Enteties;

import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import javax.persistence.*;
import java.security.PrivilegedAction;
import java.util.RandomAccess;
import java.util.UUID;
import java.security.SecureRandom;

@Entity
@Table(name = "library-card")
public class LibraryCard {
    @Id
    @Column(name = "library_card_id;")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_tessera;

    @Column(name = "numero_tessera", nullable = false, unique = true, length = 6)
    private String numeroTessera;
    @OneToOne(optional = false, orphanRemoval = true)
    @JoinColumn(name = "users_user_id", nullable = false, unique = true)
    private Users users;

    public LibraryCard(Long id_tessera, String numeroTessera, Users users) {
        this.id_tessera = id_tessera;
        this.numeroTessera = numeroTessera;
        this.users = users;
    }

    public LibraryCard() {}

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





    private static String Carattteri="ABCDEFGHILMNOPQRSTUVZXWYK";
    private static int lenghtCode=6;
    static String randomCardNumGen(){
        StringBuilder code=new StringBuilder(lenghtCode);
        SecureRandom sec=new SecureRandom();
        for (int i=0; i<lenghtCode; i++){
            int indexR=sec.nextInt(Carattteri.length());
            code.append(Carattteri.charAt(indexR));
        }
        return code.toString();
    }
}
