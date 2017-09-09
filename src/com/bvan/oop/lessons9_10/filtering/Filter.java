package com.bvan.oop.lessons9_10.filtering;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public final class Filter {

    private Filter() {}

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> res = new ArrayList<>();

        for (T elem : list) {
            if (predicate.test(elem)) {
                res.add(elem);
            }
        }

        return res;
    }
}
