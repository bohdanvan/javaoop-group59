package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithJoin {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        Thread drinkerThread = new Thread(new Drinker());
        drinkerThread.start();

        try {
            drinkerThread.join(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}

