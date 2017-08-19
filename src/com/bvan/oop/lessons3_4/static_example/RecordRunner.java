package com.bvan.oop.lessons3_4.static_example;

/**
 * @author bvanchuhov
 */
public class RecordRunner {

    public static void main(String[] args) {
        System.out.println(new Record("Java"));
        System.out.println(new Record("Java"));
        System.out.println(new Record("Java"));
        System.out.println(new Record("JavaScript"));

        System.out.println(Record.getRecordsCount());
    }
}
