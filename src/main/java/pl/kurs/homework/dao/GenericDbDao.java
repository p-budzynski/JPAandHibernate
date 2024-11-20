package pl.kurs.homework.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class GenericDbDao<T, Long> {
    private final EntityManagerFactory managerFactory;
    private final EntityManager entityManager;
    private final Class<T> entityType;

    public GenericDbDao(Class<T> entityType) {
        this.managerFactory = Persistence.createEntityManagerFactory("homeworkJPAandHibernate");
        this.entityManager = managerFactory.createEntityManager();
        this.entityType = entityType;
    }

    public void save(T t) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        try {
            entityManager.persist(t);
            transaction.commit();
        } catch (Exception ex) {
            transaction.rollback();
        }
    }

    public T get(Long id) {
        return entityManager.find(entityType, id);
    }

    public void cleanUp() {
        entityManager.close();
        managerFactory.close();
    }
}
