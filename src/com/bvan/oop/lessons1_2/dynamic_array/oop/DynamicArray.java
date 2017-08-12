package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    private int[] elems;
    private int size = 0;
    private final double growFactor;

    public DynamicArray(int initCapacity, double aGrowFactor) {
        elems = new int[initCapacity];
        growFactor = aGrowFactor;
    }

    public DynamicArray(int initCapacity) {
        this(initCapacity, 1.5);
    }

    public DynamicArray() {
        this(8);
    }

    public void addLast(int n) {
        if (elems.length == size) {
            int newLength = (int) (elems.length * growFactor);
            elems = Arrays.copyOf(elems, newLength);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < size; i++) {
            int elem = elems[i];
            joiner.add(String.valueOf(elem));
        }
        return joiner.toString();
    }
}
