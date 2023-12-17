package federicoPoggi;

import com.github.javafaker.Faker;
import federicoPoggi.Enteties.Books;
import federicoPoggi.Enteties.Catalogo;
import federicoPoggi.Enteties.GenreType;
import federicoPoggi.entetiesDAO.BookDAO;
import federicoPoggi.entetiesDAO.CatalogoDAO;
import federicoPoggi.entetiesDAO.NewspapersDAO;
import federicoPoggi.entetiesDAO.UsersDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Application {

    private static final EntityManagerFactory maneger = Persistence.createEntityManagerFactory("projectlibrary");

    public static void main(String[] args) {
        EntityManager entityManager = maneger.createEntityManager();
        UsersDao us = new UsersDao(entityManager);
        BookDAO ar = new BookDAO(entityManager);
        CatalogoDAO cat = new CatalogoDAO(entityManager);
        NewspapersDAO nd = new NewspapersDAO(entityManager);
        /*-------AGGIUNTA USER------------*/


        Faker faker = new Faker();

        /*----------------------------------------------AGGIUNTA PRODOTTI----------------------------------------------------*/

        /*Newspapers ne = new Newspapers(3097332, "Scientific American", faker.random().nextInt(40, 59), Frequenza.MENSILE);*/
        /* Newspapers ne = new Newspapers(4444781, "Time Magazine", faker.random().nextInt(40, 59), Frequenza.SETTIMANALE);*/
        /*Newspapers ne = new Newspapers(22130613, "The Economist", faker.random().nextInt(40, 59), Frequenza.SETTIMANALE);*/
        /* Newspapers ne = new Newspapers(33280836, "Nature",  faker.random().nextInt(40, 59), Frequenza.SETTIMANALE);*/
        /*Newspapers ne = new Newspapers(368733, "Smithsonian",  faker.random().nextInt(40, 59), Frequenza.MENSILE);*/
        /*Newspapers ne = new Newspapers(3458733, "Wired", faker.random().nextInt(40, 59) , Frequenza.MENSILE);*/
        /* Newspapers ne = new Newspapers(373888289, "Harvard Business Review",  faker.random().nextInt(40, 59), Frequenza.SETTIMANALE);*/

        /*------------------------------------------------------BOOKS------------------------------------------------------------*/

        /*Books books = new Books( 98239998 , "Dinheiro VIP" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.FANTASY);*/
        /*Books books = new Books( 978346782 , "Echoes of Time" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.AVVENTURA);*/
        /*Books books = new Books( 982399981 , "Whispers in the Wind" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.POESIA);*/ /*Books books = new Books( 982399981 , "Whispers in the Wind" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.POESIA);*/
        /*Books books = new Books( 982399982 , "Midnight Serenade" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.STORICO);*/
        /*Books books = new Books( 978345678 , "Journey to the Stars" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.HORROR);*/
        /*Books books = new Books( 978123450, "The Hidden Secret" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.GIALLO);*/
        /*Books books = new Books( 567890123 , "Beyond the Horizon" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.FANTASY);*/
        /*Books books = new Books( 578339395 , "Lost in Eternity" , faker.random().nextInt(200, 300), faker.book().author(), GenreType.FANTASY);*/

        // Metodi Aggiunta Libri

        /*ar.add(books);
        Catalogo catalogo = new Catalogo(books);
        cat.addNew(catalogo);*/

        //    METODI RICERCA PER NOME

        /*cat.deleteNew("Lost in Eternity");*/
        /*List<Catalogo> catalogos = cat.getAll("Beyond the Horizon");
        catalogos.forEach(System.out::println);*/

        cat.getByIsbn(2222);

        entityManager.close();
        maneger.close();
    }


}
