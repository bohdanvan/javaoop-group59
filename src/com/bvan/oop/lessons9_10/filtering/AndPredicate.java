package com.bvan.oop.lessons9_10.filtering;

import java.util.List;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class AndPredicate<T> implements Predicate<T> {

    private final List<Predicate<T>> predicates;

    public AndPredicate(List<Predicate<T>> predicates) {
        this.predicates = predicates;
    }

    @Override
    public boolean test(T val) {
        for (Predicate<T> predicate : predicates) {
            if (!predicate.test(val)) {
                return false;
            }
        }
        return true;
    }
}
