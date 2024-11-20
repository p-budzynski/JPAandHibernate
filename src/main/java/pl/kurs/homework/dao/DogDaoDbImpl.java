package pl.kurs.homework.dao;

import pl.kurs.homework.entity.Dog;

public class DogDaoDbImpl extends GenericDbDao<Dog, Long> {
    public DogDaoDbImpl() {
        super(Dog.class);
    }
}
