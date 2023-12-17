package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.Books;
import federicoPoggi.Enteties.Newspapers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class NewspapersDAO {
    public EntityManager em;

    public NewspapersDAO(EntityManager e){
        this.em=e;
    }

    public void save(Newspapers ne){
        EntityTransaction transaction= em.getTransaction();
        transaction.begin();

        em.persist(ne);

        transaction.commit();
    }

    public List<Newspapers> findByIsbn(long isbn) {
        Query query = em.createQuery("SELECT code FROM Newspapers code WHERE code.isbnCode = :isbn");
        query.setParameter("isbn", isbn);
        @SuppressWarnings ("unchecked") List<Newspapers> newspapers = query.getResultList();

        return newspapers;

    }

}

