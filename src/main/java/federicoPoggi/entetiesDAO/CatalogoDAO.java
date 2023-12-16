package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.Books;
import federicoPoggi.Enteties.Catalogo;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.*;


public class CatalogoDAO {
    private EntityManager entityManager;

    public CatalogoDAO(EntityManager en){this.entityManager=en;};

    public void addNew(Catalogo ne){
        EntityTransaction transaction=entityManager.getTransaction();
        NewspapersDAO nes=new NewspapersDAO(entityManager);
        transaction.begin();
        entityManager.persist(ne);
        transaction.commit();
    }
    public void addBo(Books bo){
        EntityTransaction transaction=entityManager.getTransaction();
        BookDAO bd=new BookDAO(entityManager);
        transaction.begin();
        bd.add(bo);

        transaction.begin();
        Catalogo catb=new Catalogo(bo);
        entityManager.persist(catb);
        transaction.commit();
    }

    public void deleteNew(String title){
        EntityTransaction transaction= entityManager.getTransaction();
        transaction.begin();
        Query delete = entityManager.createQuery("DELETE FROM Catalogo where article_title = :title");
        int numeroEliminato =  delete.setParameter("title",title).executeUpdate();
        Query deleteFromArt= entityManager.createQuery("DELETE FROM Newspapers WHERE title =:title");
        deleteFromArt.setParameter("title",title).executeUpdate();
        System.out.println("Ho eliminato "+numeroEliminato);
        transaction.commit();
    }

}
