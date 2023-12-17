package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.Books;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.Collection;
import java.util.List;

public class BookDAO {
    public EntityManager em;

    public BookDAO(EntityManager e) {
        this.em = e;
    }

    public void add(Books bo) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        em.persist(bo);

        transaction.commit();
    }


    public List<Books> findByIsbn(long isbn) {
        Query query = em.createQuery("SELECT code FROM Books code WHERE code.isbnCode = :isbn");
        query.setParameter("isbn", isbn);
        @SuppressWarnings ("unchecked") List<Books> booksList = query.getResultList();

        return booksList;

    }

}
