package federicoPoggi.Enteties;

import javax.persistence.*;

@Entity
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
@Table (name = "newspapers")
public class Newspapers extends Articles {
    @Column (name = "isbn_code", unique = true)
    private long isbnCode;

    @Enumerated (value = EnumType.STRING)
    @Column (name = "periodicity")
    Frequenza periodicity;

    public Newspapers(long isbnCode, String title, int pages_numbers, Frequenza periodicity) {
        this.isbnCode = isbnCode;
        this.title = title;
        this.pubDate = generateRandomDate();
        this.pages_numbers = pages_numbers;
        this.periodicity = periodicity;
    }


    public Newspapers() {
    }




    /*----GETTERS---*/

    public Frequenza getPeriodicity() {
        return periodicity;
    }

    public long getIsbnCode() {
        return isbnCode;
    }

    @Override
    public String toString() {
        return "Newspapers{" + "id=" + id + " + isbnCode=" + getIsbnCode() + " periodicity=" + getPeriodicity() + " title: " + getTitle() + ", pubDate: " + getPubDate() + ", pages_numbers=" + getPages_numbers() + '}';
    }
}
