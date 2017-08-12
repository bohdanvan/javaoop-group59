package com.bvan.oop.lessons1_2.person.oop;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class OOPPersonRunner {

    public static void main(String[] args) {
        Person person = new Person("John", 25);
        String message = person.sayHello();
        System.out.println(message);
    }
}
