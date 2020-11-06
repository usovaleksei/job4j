package ru.job4j.collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    //method adding persons in PhoneDictionary
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * return the list of persons with param key in the any field
     * @param key key of search
     * @return result list of persons
     */
    public ArrayList<Person> find(String key) {

        Predicate<Person> nameSearch = t -> t.getName().contains(key);
        Predicate<Person> surnameSearch = t -> t.getSurname().contains(key);
        Predicate<Person> phoneSearch = t -> t.getPhone().contains(key);
        Predicate<Person> addressSearch = t -> t.getAddress().contains(key);
        Predicate<Person> combine = nameSearch.or(surnameSearch).or(phoneSearch).or(addressSearch);
        ArrayList<Person> result = new ArrayList<>();
        for (var person: persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

