package JavaGuru.collections.compar;

import java.util.*;

public class TestComp {
    public static void main(String[] args) {
        List<Person> listPerson = new ArrayList<>();
        listPerson.add(new Person("Tom", 25));
        listPerson.add(new Person("Jack", 30));
        listPerson.add(new Person("Jack", 15));
        listPerson.add(new Person("Phil", 22));
        listPerson.add(new Person("Bob", 33));

        System.out.println(listPerson);

        // Ссылки на методы
        listPerson.sort((Comparator.comparing(Person::getName)).thenComparing(Person::getAge));

        // Стандартный способ
        listPerson.sort(new PersonNameComparator().thenComparing(new PersonAgeComparator()));

        System.out.println(listPerson);
    }
}
