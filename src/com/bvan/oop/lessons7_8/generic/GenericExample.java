package com.bvan.oop.lessons7_8.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class GenericExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("John");

        String name = names.get(0);
        System.out.println(name);
    }
}
