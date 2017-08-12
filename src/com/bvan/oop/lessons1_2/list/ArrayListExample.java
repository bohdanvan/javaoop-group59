package com.bvan.oop.lessons1_2.list;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        System.out.println(list);

        for (Integer elem : list) {
            System.out.println(elem);
        }
    }
}
