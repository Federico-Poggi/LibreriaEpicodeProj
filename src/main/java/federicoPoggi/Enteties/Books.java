package federicoPoggi.Enteties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "books")
public class Books extends Articles {

    @Column (name = "isbn", nullable = false, unique = true)
    private long isbnCode;
    @Column (name = "author", nullable = false, length = 30)
    private String authorName;

    @Enumerated (EnumType.STRING)
    @Column (name = "genres")
    private GenreType genreType;


    public Books(long isbnCode, String title, int pages_numbers, String authorName, GenreType genType) {
        this.isbnCode = isbnCode;
        this.title = title;
        this.authorName = authorName;
        this.pubDate = generateRandomDate();
        this.pages_numbers = pages_numbers;
        this.genreType = genType;
    }

    public Books() {
    }

    ;



    /*----GETTERS---*/

    public String getAuthorName() {
        return authorName;
    }

    public GenreType getGenreType() {
        return genreType;
    }

    public long getIsbnCode() {
        return isbnCode;
    }

    /*----SETTER----*/

    public void setGenreType() {
        this.genreType = genreType;
    }


    @Override
    public String toString() {
        return "Newspapers{" + "id=" + id + " + isbnCode=" + getIsbnCode() + " Genere: " + getGenreType().toString()  +
                " title: " + getTitle() + ", pubDate: " + getPubDate() + ", pages_numbers=" + getPages_numbers() +
                " Autore: "  + getAuthorName()  +'}';
    }

}
