package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.Books;
import federicoPoggi.Enteties.Catalogo;
import federicoPoggi.Enteties.Newspapers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;


public class CatalogoDAO {
    private final EntityManager entityManager;

    public CatalogoDAO(EntityManager en) {
        this.entityManager = en;
    }

    public void addNew(Catalogo ne) {
        EntityTransaction transaction = entityManager.getTransaction();
        NewspapersDAO nes = new NewspapersDAO(entityManager);
        transaction.begin();
        entityManager.persist(ne);
        transaction.commit();
    }

    public void addBo(Books bo) {
        EntityTransaction transaction = entityManager.getTransaction();
        BookDAO bd = new BookDAO(entityManager);
        transaction.begin();
        entityManager.persist(bo);
        transaction.begin();
        transaction.commit();
    }

    public void deleteBook(String title) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Query delete = entityManager.createQuery("DELETE FROM Catalogo where article_title = :title");
        int numeroEliminato = delete.setParameter("title", title).executeUpdate();
        Query deleteFromArt = entityManager.createQuery("DELETE FROM Books WHERE title =:title");
        deleteFromArt.setParameter("title", title).executeUpdate();
        System.out.println("Ho eliminato " + numeroEliminato);
        transaction.commit();
    }

    public void deletenew(String title) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Query delete = entityManager.createQuery("DELETE FROM Catalogo where article_title = :title");
        int numeroEliminato = delete.setParameter("title", title).executeUpdate();
        Query deleteFromArt = entityManager.createQuery("DELETE FROM Newspapers WHERE title =:title");
        deleteFromArt.setParameter("title", title).executeUpdate();
        System.out.println("Ho eliminato " + numeroEliminato);
        transaction.commit();
    }

    public List<Catalogo> getAll(String title) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Query q = entityManager.createQuery("SELECT c FROM Catalogo c where c.article_title like :title");
        q.setParameter("title", "%" + title + "%");
        @SuppressWarnings ("unchecked") List<Catalogo> results = q.getResultList();
        transaction.commit();
        return results;
    }

    public void getByIsbn(int isbn){
        NewspapersDAO newspapersDAO=new NewspapersDAO(entityManager);
        BookDAO bookDAO=new BookDAO(entityManager);
        EntityTransaction entityTransaction=entityManager.getTransaction();
        entityTransaction.begin();
        bookDAO.findByIsbn(isbn);
        List<Newspapers> newspapers = newspapersDAO.findByIsbn(isbn);
        List<Books> booksList= bookDAO.findByIsbn(isbn);

        if (newspapers.isEmpty() && booksList.isEmpty()) {
            System.out.println("Non esistono elementi con l'isbn dato");
            entityTransaction.commit();
        }
        else if (!newspapers.isEmpty()){
            newspapers.forEach(System.out::println);
            entityTransaction.commit();
        }
        else{
            booksList.forEach(System.out::println);
            entityTransaction.commit();
        }

    }



}
