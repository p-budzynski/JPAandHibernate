package pl.kurs.dao;

import pl.kurs.entity.Car;

public interface CarDao {
    void save(Car car);
    Car get(Long id);
    void cleanUp();
}
