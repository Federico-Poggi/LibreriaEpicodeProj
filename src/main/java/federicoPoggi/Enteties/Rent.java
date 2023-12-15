package federicoPoggi.Enteties;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "rents")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "article_loaned")
    private String isbnArticle;

    @Column(name = "start_loan_date")
    private LocalDate loanDate;

    @Column(name = "expected_return_date")
    private LocalDate returnDate;

    @Column(name = "actual_return_date")
    private LocalDate actualdate;

    //many to one siccome un utente puo avere tanti prestiti
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;


    private List<Books> books = new ArrayList<>();
    public Rent() {}

    public Rent(Users u){
        this.users=u;
    }
    public Rent(List<Books> bo){
        this.books=bo;
    }
    public Rent(long id, String isbnArticle, LocalDate loanDate, LocalDate returnDate, LocalDate actualdate) {
        this.id = id;
        this.isbnArticle = isbnArticle;
        this.loanDate = loanDate;
        this.returnDate = returnDate;
        this.actualdate = actualdate;
    }




    /*GETTER AND SETTER*/
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIsbnArticle() {
        return isbnArticle;
    }

    public void setIsbnArticle(String isbnArticle) {
        this.isbnArticle = isbnArticle;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getActualdate() {
        return actualdate;
    }

    public void setActualdate(LocalDate actualdate) {
        this.actualdate = actualdate;
    }

    public LocalDate setLoanDate (String lo) {
        LocalDate loc= LocalDate.parse(lo, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return this.loanDate = loc;
    }
}
