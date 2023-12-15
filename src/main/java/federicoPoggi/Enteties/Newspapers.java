package federicoPoggi.Enteties;

import org.hibernate.engine.jdbc.spi.SchemaNameResolver;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Table(name = "newspapers")
public class Newspapers extends Articles{

    @Column(name = "periodicity")
    Frequenza periodicity;

    public Newspapers(String  isbnCode, String title, String pubDate, int pages_numbers, Frequenza periodicity) {
        super(isbnCode, title, pubDate, pages_numbers);
        this.periodicity=periodicity;
    }

    public Newspapers() {
    }

    /*----GETTERS---*/

    public Frequenza getPeriodicity() {
        return periodicity;
    }
}
