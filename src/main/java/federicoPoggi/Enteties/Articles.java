package federicoPoggi.Enteties;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


@MappedSuperclass
abstract class Articles {
    @Id
    @Generated(
            GenerationTime.ALWAYS
    )
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "article_title", nullable = false,length = 50)
    protected String title;

    @Column(name = "publication_year", nullable = false)
    protected LocalDate pubDate;

    @Column(name = "pages_numbers", nullable = false)
    protected int pages_numbers;


    /*---GETTERS---*/


    public Long getId() {
        return id;
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
        LocalDate loc= LocalDate.parse(eve, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        return this.pubDate = loc;
    }

}
