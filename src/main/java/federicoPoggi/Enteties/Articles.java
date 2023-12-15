package federicoPoggi.Enteties;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@MappedSuperclass
abstract class Articles {
    @Id
    @Column(name = "isbn_id", nullable = false, updatable = false)
    private char  isbnCode;

    @Column(name = "article_title", nullable = false,length = 50)
    protected String title;

    @Column(name = "publication_year", nullable = false)
    protected LocalDate pubDate;

    @Column(name = "pages_numbers", nullable = false)
    protected int pages_numbers;


    public Articles(char isbnCode, String title, LocalDate pubDate, int pages_numbers) {
        this.isbnCode = isbnCode;
        this.title = title;
        this.pubDate = pubDate;
        this.pages_numbers = pages_numbers;
    }
    public Articles(){};



    /*---GETTERS---*/

    public char getIsbnCode() {
        return isbnCode;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getPubDate() {
        return pubDate;
    }

    public int getPages_numbers() {
        return pages_numbers;
    }

}
