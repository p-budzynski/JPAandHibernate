package pl.kurs.homework.dao;

import pl.kurs.homework.entity.Person;

public class PersonDaoDbImpl extends GenericDbDao <Person, Long> {
    public PersonDaoDbImpl() {
        super(Person.class);
    }
}
