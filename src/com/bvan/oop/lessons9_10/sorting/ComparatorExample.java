package com.bvan.oop.lessons9_10.sorting;

import com.bvan.oop.common.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ComparatorExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Taras", 25),
                new Person("Ivan", 30),
                new Person("Lesya", 20)
        );

        Comparator<Person> comparator = ageComparator();
        Comparator<Person> reversedComparator = Collections.reverseOrder(comparator);
        Collections.sort(people, reversedComparator);

        System.out.println(people);
    }

    private static Comparator<Person> ageComparator() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return 0;
            }
        };
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person a, Person b) {
        int ageA = a.getAge();
        int ageB = b.getAge();
        return Integer.compare(ageA, ageB);
    }
}

