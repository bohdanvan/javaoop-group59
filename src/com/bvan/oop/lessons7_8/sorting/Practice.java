package com.bvan.oop.lessons7_8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Practice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "John", // nhoJ
                "Bob", // boB
                "Phil", // lihP
                "Alex",
                "Michael",
                "Ira", // arA
                "Sofia" // aifoS
        );

        Collections.sort(names);
        System.out.println("Alphabetical order, ASC: " + names);

        Collections.sort(names, Collections.reverseOrder());
        System.out.println("Alphabetical order, DESC: " + names);

        Collections.sort(names, new LengthComparator());
        System.out.println("Length order, ASC: " + names);

        Collections.sort(names, Collections.reverseOrder(new LengthComparator()));
        System.out.println("Length order, DESC: " + names);

        Collections.sort(names, new EpicComparator());
        System.out.println("Epic order, ASC: " + names);
    }
}

class LengthComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

class EpicComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return reversed(a).compareTo(reversed(b));
    }

    private String reversed(String a) {
        return new StringBuilder(a).reverse().toString();
    }
}