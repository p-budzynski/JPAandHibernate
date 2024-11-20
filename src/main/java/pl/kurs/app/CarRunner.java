package pl.kurs.app;

import pl.kurs.dao.CarDao;
import pl.kurs.dao.CarDaoDbImpl;
import pl.kurs.entity.Car;

public class CarRunner {
    public static void main(String[] args) {
        CarDao carDao = new CarDaoDbImpl();
        Car car = new Car("BMW", "740Li", "black",320);

        carDao.save(car);
        System.out.println("Zapisano.");

        Car loadedCar = carDao.get(1L);
        System.out.println(loadedCar);

        carDao.cleanUp();
    }
}
