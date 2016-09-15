package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import mypackage.Customer;

/**
 *
 * @author Peter
 */
public class Tester {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex3PU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Customer cus1 = new Customer();
        em.persist(cus1);

        em.getTransaction().commit();
        em.close();
    }
}
