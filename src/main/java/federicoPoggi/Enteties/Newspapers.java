package federicoPoggi.Enteties;

import org.hibernate.annotations.GeneratorType;
import org.hibernate.engine.jdbc.spi.SchemaNameResolver;
import org.hibernate.loader.custom.FetchReturn;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "newspapers")
public class Newspapers extends Articles{
    @Column(name = "isbn_code", unique = true)
    private long  isbnCode;

    @Enumerated(value =EnumType.STRING)
    @Column(name = "periodicity")
    Frequenza periodicity;

    public Newspapers(long isbnCode,String title, String pubDate, int pages_numbers, Frequenza periodicity) {
        this.isbnCode=isbnCode;
        this.title=title;
        this.pubDate=setArticledate(pubDate);
        this.pages_numbers=pages_numbers;
        this.periodicity = periodicity;
    }



    public Newspapers() {
    }




    public LocalDate setYear(String eve) {
        LocalDate loc= LocalDate.parse(eve, DateTimeFormatter.ofPattern("yyyy"));
        return this.pubDate = loc;
    }


    /*----GETTERS---*/

    public Frequenza getPeriodicity() {
        return periodicity;
    }
}
