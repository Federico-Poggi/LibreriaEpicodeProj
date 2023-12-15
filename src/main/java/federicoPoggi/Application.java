package federicoPoggi;

import federicoPoggi.Enteties.LibraryCard;
import federicoPoggi.Enteties.Users;
import federicoPoggi.entetiesDAO.LibraryCardDAO;
import federicoPoggi.entetiesDAO.UsersDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory maneger= Persistence.createEntityManagerFactory("projectlibrary");
    public static void main(String[] args) {
        EntityManager entityManager= maneger.createEntityManager();
        UsersDao us=new UsersDao(entityManager);

/*-------------AGGIUNTA USER-------------------------*/
        {
                /*Users users = new Users("Laura", "blu", "23-09-1998");
                us.save(users);*/

        }
        /*----------------------------*/
        {


        }



        entityManager.close();
        maneger.close();
    }
}
