package hib;

import hib.HibernateFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Dao<T> {

    private HibernateFactory hibernateFactory;

    public Dao() {
        hibernateFactory = new HibernateFactory();
    }

    public void add(T object) {
        Session session = hibernateFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(object);
            session.getTransaction().commit();
        } catch (Exception ex) {
            transaction.rollback();
            ex.printStackTrace();
            throw new RuntimeException(ex);
        } finally {
            session.close();
        }
    }
}
