package com.bvan.oop.lessons1_2.person.proc;

/**
 * @author bvanchuhov
 */
public class ProcPersonRunner {

    public static void main(String[] args) {
        ProcPerson person = new ProcPerson();
        person.name = "John";
        person.age = 25;

        String message = getPersonInfo(person);

        System.out.println(message);
    }

    private static String getPersonInfo(ProcPerson person) {
        return "Hello, I'm " + person.name + ", "
                + person.age + " years old";
    }
}
