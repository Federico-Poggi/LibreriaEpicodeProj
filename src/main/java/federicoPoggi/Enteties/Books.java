package federicoPoggi.Enteties;

import com.github.javafaker.DateAndTime;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "books")
public class Books extends Articles{

    @Column(name = "author", nullable = false, length = 30)
    private String authorName;

    @Column(name = "genres")
    private String genreType;



    public Books(String isbnCode, String title, String pubDate, int pages_numbers,String authorName,GenreType genType){
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
