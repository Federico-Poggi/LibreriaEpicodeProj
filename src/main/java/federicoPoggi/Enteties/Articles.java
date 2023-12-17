package federicoPoggi.Enteties;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenerationTime;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;


@MappedSuperclass
abstract class Articles {
    @Id
    @Generated (GenerationTime.ALWAYS)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column (name = "article_title", nullable = false, length = 50)
    protected String title;

    @Column (name = "publication_year", nullable = false)
    protected String pubDate;

    @Column (name = "pages_numbers", nullable = false)
    protected int pages_numbers;


    /*---GETTERS---*/


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getPubDate() {
        return pubDate;
    }

    public int getPages_numbers() {
        return pages_numbers;
    }




    /*METODI COMUNI*/

    public static String generateRandomDate() {
        Random random = new Random();

        // Imposta una data casuale nell'intervallo degli ultimi 10 anni
        int year = LocalDate.now().getYear() - random.nextInt(10);
        int month = random.nextInt(12) + 1; // Mesi da 1 a 12
        int day = random.nextInt(31) + 1; // Giorni da 1 a 31

        LocalDate randomDate = LocalDate.of(year, month, day);

        // Formatta la data nel formato desiderato
        return randomDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

}
