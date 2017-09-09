package com.bvan.oop.lessons9_10.filtering;

import com.bvan.oop.common.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class Filtering {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Taras", 25),
                new Person("Lesya", 20),
                new Person("Ivan", 30)
        );
        List<Person> peopleWithAge15To23 = Filter.filter(people, and(byAge(10, 23)));
        System.out.println(peopleWithAge15To23);
    }

    private static Predicate<Person> byAge(int minAge, int maxAge) {
        return new Predicate<Person>() {
            @Override
            public boolean test(Person p) {
                return p.getAge() >= minAge && p.getAge() <= maxAge;
            }
        };
    }

    private static <T> Predicate<T> and(Predicate<T>... predicates) {
        return new AndPredicate<>(Arrays.asList(predicates));
    }
}

