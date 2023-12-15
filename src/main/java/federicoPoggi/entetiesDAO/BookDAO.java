package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.Books;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class BookDAO {
    public EntityManager em;

    public BookDAO(EntityManager e){
        this.em=e;
    }

    public void add(Books bo){
        EntityTransaction transaction= em.getTransaction();
        transaction.begin();

        em.persist(bo);

        transaction.commit();
    }


}
