package com.bvan.oop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] elems = readClientElems(scanner);

        System.out.println(Arrays.toString(elems));
        System.out.println("Goodbye");
    }

    private static int[] readClientElems(Scanner scanner) {
        int[] elems = new int[4];
        int size = 0;

        int n = readInt(scanner);
        while (n != 0) {
            if (elems.length == size) {
                int newLength = (int) (elems.length * 1.5);
                elems = Arrays.copyOf(elems, newLength);
            }
            elems[size] = n;
            size++;

            n = readInt(scanner);
        }
        return Arrays.copyOf(elems, size);
    }

    private static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length + 1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }

    private static int readInt(Scanner scanner) {
        System.out.print(">> ");
        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Sorry, illegal element");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }
}
