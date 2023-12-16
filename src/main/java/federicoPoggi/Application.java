package federicoPoggi;

import com.github.javafaker.Cat;
import com.github.javafaker.Faker;
import federicoPoggi.Enteties.*;
import federicoPoggi.entetiesDAO.BookDAO;
import federicoPoggi.entetiesDAO.CatalogoDAO;
import federicoPoggi.entetiesDAO.NewspapersDAO;
import federicoPoggi.entetiesDAO.UsersDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;

public class Application {

    private static final EntityManagerFactory maneger= Persistence.createEntityManagerFactory("projectlibrary");
    public static void main(String[] args) {
        EntityManager entityManager= maneger.createEntityManager();
        UsersDao us=new UsersDao(entityManager);
        BookDAO ar=new BookDAO(entityManager);
        CatalogoDAO cat=new CatalogoDAO(entityManager);
        NewspapersDAO nd=new NewspapersDAO(entityManager);
        /*-------AGGIUNTA USER------------*/




        /*-------AGGIUNTA PRODOTTI-------*/

        /*Newspapers ne=new Newspapers(22450934,"JapanTrip", "2023-08-21" ,53,Frequenza.MENSILE);
        nd.save(ne);
        Catalogo catalogo=new Catalogo(ne);
        cat.addNew(catalogo);*/
        /*Books books=new Books(44256212,"Guerra e pace","1869-08-07",553,"Lev Tolsto",GenreType.FANTASY);
        cat.addBo(books);*/
        cat.deleteNew("JapanTrip");
        entityManager.close();
        maneger.close();
    }
}
