package federicoPoggi.Enteties;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@MappedSuperclass
abstract class Articles {
    @Id
    @Column(name = "isbn_id", nullable = false, updatable = false)
    private String  isbnCode;

    @Column(name = "article_title", nullable = false,length = 50)
    protected String title;

    @Column(name = "publication_year", nullable = false)
    protected LocalDate pubDate;

    @Column(name = "pages_numbers", nullable = false)
    protected int pages_numbers;









    public Articles(String isbnCode, String title, String pubDate, int pages_numbers) {
        this.isbnCode = isbnCode;
        this.title = title;
        this.pubDate = setArticledate(pubDate);
        this.pages_numbers = pages_numbers;
    }
    public Articles(){};



    /*---GETTERS---*/

    public String getIsbnCode() {
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

    public LocalDate setArticledate(String eve) {
        LocalDate loc= LocalDate.parse(eve, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return this.pubDate = loc;
    }

}
