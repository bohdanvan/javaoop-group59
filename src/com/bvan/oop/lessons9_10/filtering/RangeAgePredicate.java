package com.bvan.oop.lessons9_10.filtering;

import com.bvan.oop.common.Person;

import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class RangeAgePredicate implements Predicate<Person> {

    private final int minAge;
    private final int maxAge;

    public RangeAgePredicate(int minAge, int maxAge) {
        this.minAge = minAge;
        this.maxAge = maxAge;
    }

    @Override
    public boolean test(Person p) {
        return p.getAge() >= minAge && p.getAge() <= maxAge;
    }
}
