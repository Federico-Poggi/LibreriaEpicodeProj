package federicoPoggi.Enteties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "users")

public class Users {

    @Id
    @Column(nullable = false)
    private long user_id;

    @Column(name = "user_name", nullable = false, length = 30)
    private String user_name;

    @Column(name = "user_last_name", nullable = false, length = 30)
    private String user_last_name;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birth_date;

    @OneToOne(mappedBy = "users", orphanRemoval = true)
    private LibraryCard libraryCard;



    public Users(long user_id, String user_name, String user_last_name, LocalDate birth_date) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_last_name = user_last_name;
        this.birth_date = birth_date;
    }

    public Users() {}




    /*---GETTERS AND SETTER---*/
    public LibraryCard getLibraryCard() {
        return libraryCard;
    }


    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }
}
