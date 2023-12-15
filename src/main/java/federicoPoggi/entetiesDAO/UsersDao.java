package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.LibraryCard;
import federicoPoggi.Enteties.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UsersDao {

    public EntityManager en;

    public UsersDao(EntityManager en){this.en=en;}

    public void save(Users user, LibraryCard lis){
        EntityTransaction transaction=en.getTransaction();
        LibraryCardDAO li=new LibraryCardDAO(en);
        transaction.begin();
        li.save(lis,user);
        en.persist(user);
        transaction.commit();
    }

    public void delete(Users user){

    }
}
