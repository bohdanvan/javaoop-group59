package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Bar {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();
        new Thread(new Drinker()).start();

        ThreadUtils.println("Bar is closed");
    }
}

