package pl.kurs.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import pl.kurs.entity.Car;

public class CarDaoDbImpl implements CarDao {
    private EntityManagerFactory managerFactory;
    private EntityManager entityManager;

    public CarDaoDbImpl() {
        this.managerFactory = Persistence.createEntityManagerFactory("persistencePostgres");
        this.entityManager = managerFactory.createEntityManager();
    }

    @Override
    public void save(Car car) {
        EntityTransaction transaction = entityManager.getTransaction(); // Pobranie obiektu transakcji z EntityManagera
        transaction.begin(); // Rozpoczecie transkacji, efekty beda widzoczne dopiero po commit/rollback
        try {
            entityManager.persist(car); // Persist - zapis Car'a do bazy
            transaction.commit(); // Commit transakcji
        } catch (Exception ex) {
            transaction.rollback(); // Rollback w przypadku bledu
        }

    }

    @Override
    public Car get(Long id) {
        return entityManager.find(Car.class, id);
    }

    @Override
    public void cleanUp() {
        entityManager.close();
        managerFactory.close();
    }
}
