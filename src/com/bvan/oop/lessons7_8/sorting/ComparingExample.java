package com.bvan.oop.lessons7_8.sorting;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        System.out.println(Integer.compare(10, 20)); // < 0
        System.out.println(Integer.compare(10, 10)); // 0
        System.out.println(Integer.compare(30, 20)); // > 0
        System.out.println();

        System.out.println("ABCZ".compareTo("EFG")); // < 0
        System.out.println("AAAZ".compareTo("AAAY")); // > 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println();

        Integer x = 10;
        Integer y = 20;
        System.out.println(x.compareTo(y)); // < 0
    }
}
