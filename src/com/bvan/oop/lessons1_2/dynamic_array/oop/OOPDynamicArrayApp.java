package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPDynamicArrayApp {

    public static void main(String[] args) {
        RepeatableReader reader = new RepeatableReader(System.in);
        DynamicArray elems = readClientElems(reader);

        System.out.println(elems.toString());
        System.out.println("Goodbye");
    }

    private static DynamicArray readClientElems(RepeatableReader reader) {
        DynamicArray elems = new DynamicArray(20, 2.0);

        int n = reader.readInt();
        while (n != 0) {
            elems.addLast(n);
            n = reader.readInt();
        }
        return elems;
    }
}
