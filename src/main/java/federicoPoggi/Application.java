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
        LibraryCard lis=new LibraryCard();
        Users users=new Users("Luca","sassi","22-10-2003",lis);
        us.save(users,lis);
        /*li.save(lis);*/

        entityManager.close();
        maneger.close();
    }
}
