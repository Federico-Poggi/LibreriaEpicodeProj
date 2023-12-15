package federicoPoggi.Enteties;

import org.hibernate.annotations.GeneratorType;
import federicoPoggi.Enteties.LibraryCard;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "users")

public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long user_id;


    @Column(name = "user_name", nullable = false, length = 30)
    private String userName;

    @Column(name = "user_last_name", nullable = false, length = 30)
    private String userLastName;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birth_date;

    @OneToOne
    @JoinColumn(name = "card_id")
    private LibraryCard libraryCard;



    public Users(String user_name, String user_last_name, String birth_date,LibraryCard li) {
        this.user_id=getUser_id();
        this.userName = user_name;
        this.userLastName = user_last_name;
        this.birth_date = setBirth_date(birth_date);
        this.libraryCard=li;
    }

    public Users() {}




    /*---GETTERS AND SETTER---*/

    public long getUser_id() {
        return user_id;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public LibraryCard getLibraryCard() {
        return libraryCard;
    }

    public LocalDate setBirth_date(String eve) {
        LocalDate loc= LocalDate.parse(eve, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return this.birth_date = loc;
    }
}
