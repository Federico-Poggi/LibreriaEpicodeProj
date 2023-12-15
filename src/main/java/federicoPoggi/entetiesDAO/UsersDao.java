package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.LibraryCard;
import federicoPoggi.Enteties.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UsersDao {

    public EntityManager en;

    public UsersDao(EntityManager en){this.en=en;}

    public void save(Users user){
        EntityTransaction transaction=en.getTransaction();
        LibraryCardDAO li=new LibraryCardDAO(en);
        transaction.begin();
        LibraryCard lis=new LibraryCard();
        lis.setUsers(user);
        li.save(lis);
        user.setLibraryCard(lis);
        en.persist(user);
        transaction.commit();
    }

    public void delete(Users user){

    }
}
