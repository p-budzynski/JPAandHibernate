package pl.kurs.homework.app;

import pl.kurs.homework.dao.DogDaoDbImpl;
import pl.kurs.homework.entity.Dog;

public class DogRunner {
    public static void main(String[] args) {
        DogDaoDbImpl dogDao = new DogDaoDbImpl();
        Dog dog = new Dog("Azor", "owczarek", 4, 7.5, "black", true, true, true);

        dogDao.save(dog);

        Dog findedDog = dogDao.get(1L);
        System.out.println(findedDog);

        dogDao.cleanUp();
    }
}
