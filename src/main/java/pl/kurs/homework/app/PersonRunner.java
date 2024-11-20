package pl.kurs.homework.app;

import pl.kurs.homework.dao.GenericDbDao;
import pl.kurs.homework.entity.Person;

public class PersonRunner {
    public static void main(String[] args) {
        GenericDbDao<Person, Long> personDao = new GenericDbDao<>(Person.class);
        Person person = new Person("Jan", "Kowalski", 20, true, "00-199 Warszawa, ul. Błotna 99", "522 789 951");

        personDao.save(person);

        Person loadedPerson = personDao.get(1L);
        System.out.println(loadedPerson);

        personDao.cleanUp();

    }
}
