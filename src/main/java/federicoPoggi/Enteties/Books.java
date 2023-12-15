package federicoPoggi.Enteties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "books")
public class Books extends Articles{

    @Column(name = "author", nullable = false, length = 30)
    private String authorName;

    @Column(name = "genres")
    private String genreType;

    public Books(char isbnCode, String title, LocalDate pubDate, int pages_numbers,String authorName,GenreType genType){
        super(isbnCode,title,pubDate,pages_numbers);
        this.authorName=authorName;
        this.genreType=genType.getDescrizione();
    }
    public Books(){};



    /*----GETTERS---*/

    public String getAuthorName() {
        return authorName;
    }

    public String getGenreType() {
        return genreType;
    }

    /*----SETTER----*/

    public void setGenreType(String genreType) {
        this.genreType = genreType;
    }

}
