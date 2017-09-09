package com.bvan.oop.lessons9_10.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author bvanchuhov
 */
public class GenresExample {

    public static void main(String[] args) {
        Set<Genre> genres = new LinkedHashSet<>();

        genres.add(Genre.ACTION);
        genres.add(Genre.COMEDY);
        genres.add(Genre.THRILLER);
        genres.add(Genre.COMEDY);
        genres.add(Genre.THRILLER);
        genres.add(Genre.THRILLER);

        System.out.println(genres);

        boolean contains = genres.contains(Genre.THRILLER);
        System.out.println(contains);
    }
}

enum Genre {
    COMEDY,
    ACTION,
    THRILLER,
    DRAMA,
    HORROR
}
