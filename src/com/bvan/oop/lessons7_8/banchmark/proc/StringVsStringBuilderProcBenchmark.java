package com.bvan.oop.lessons7_8.banchmark.proc;

/**
 * @author Bohdan Vanchuhov
 */
public class StringVsStringBuilderProcBenchmark {

    private static final int ADDING_QUANTITY = 1000_000;
    private static final String STRING_FOR_APPEND = "1";

    public static void main(String[] args) {
        System.out.println("String builder: " + useStringBuilderTime());
        System.out.println("String: " + useStringTime());
    }

    private static void useStringBuilder() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            sb.append(STRING_FOR_APPEND);
        }
    }

    private static void useString() {
        String s = "";
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            s += STRING_FOR_APPEND;
        }
    }

    private static void useStringBuffer() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < ADDING_QUANTITY; i++) {
            sb.append(STRING_FOR_APPEND);
        }
    }

    private static long useStringBuilderTime() {
        long start = System.currentTimeMillis(); // 1.1.1970 00:00

        useStringBuilder();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long useStringTime() {
        long start = System.currentTimeMillis();

        useString();

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    private static long useStringBufferTime() {
        long start = System.currentTimeMillis();

        useStringBuffer();

        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
