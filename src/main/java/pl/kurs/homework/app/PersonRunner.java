package pl.kurs.homework.app;

import pl.kurs.homework.dao.PersonDaoDbImpl;
import pl.kurs.homework.entity.Person;

public class PersonRunner {
    public static void main(String[] args) {
        PersonDaoDbImpl personDao = new PersonDaoDbImpl();
        Person person = new Person("Jan", "Kowalski", 20, true, "00-199 Warszawa, ul. Błotna 99", "522 789 951");

        personDao.save(person);

        Person loadedPerson = personDao.get(1L);
        System.out.println(loadedPerson);

        personDao.cleanUp();

    }
}
