package federicoPoggi;

import com.github.javafaker.Faker;
import federicoPoggi.Enteties.Books;
import federicoPoggi.Enteties.GenreType;
import federicoPoggi.entetiesDAO.BookDAO;
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
        NewspapersDAO ne=new NewspapersDAO(entityManager)
/*-------------AGGIUNTA USER-------------------------*/
        {
                /*Users users = new Users("Laura", "blu", "23-09-1998");
                us.save(users);*/

        };

        /*----------------------------*/
        {


        }



        entityManager.close();
        maneger.close();
    }
}
