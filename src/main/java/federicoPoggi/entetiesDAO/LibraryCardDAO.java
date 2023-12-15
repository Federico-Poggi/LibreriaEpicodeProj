package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.LibraryCard;
import federicoPoggi.Enteties.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LibraryCardDAO {
    public EntityManager en;
    public LibraryCardDAO(EntityManager en){this.en=en;};

    public void save(LibraryCard li,Users u){
        /*EntityTransaction transaction=en.getTransaction();*/


        en.persist(li);
        en.persist(u);


    }

}
