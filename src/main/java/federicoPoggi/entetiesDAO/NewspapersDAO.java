package federicoPoggi.entetiesDAO;

import federicoPoggi.Enteties.Books;
import federicoPoggi.Enteties.Newspapers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class NewspapersDAO {
    public EntityManager em;

    public NewspapersDAO(EntityManager e){
        this.em=e;
    }

    public void add(Newspapers ne){
        EntityTransaction transaction= em.getTransaction();
        transaction.begin();

        em.persist(ne);

        transaction.commit();
    }


}

