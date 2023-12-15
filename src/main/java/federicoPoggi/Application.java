package federicoPoggi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory maneger= Persistence.createEntityManagerFactory("projectLibrary");
    public static void main(String[] args) {
        EntityManager entityManager= maneger.createEntityManager();
    }
}
