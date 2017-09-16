package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private static int nextId = 0;
    private final int id = nextId++;

    @Override
    public void run() {
        for (int beer = 0; beer < 3; beer++) {
            ThreadUtils.println(drinkerInfo() + "I'm drinking " + beer + " beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private String drinkerInfo() {
        return "I'm " + id + " drinker. ";
    }
}
