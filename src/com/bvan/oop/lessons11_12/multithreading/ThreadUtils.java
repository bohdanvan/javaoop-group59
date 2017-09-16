package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class ThreadUtils {

    private ThreadUtils() {}

    public static void println(Object o) {
        Thread thread = Thread.currentThread();
        System.out.println(String.format("%-15s: %s", thread.getName(), o));
    }
}
