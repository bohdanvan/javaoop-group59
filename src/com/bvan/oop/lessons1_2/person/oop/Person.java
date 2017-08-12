package com.bvan.oop.lessons1_2.person.oop;

/**
 * @author bvanchuhov
 */
public class Person {

    private final String name; // field, attribute
    private final int age;

    public Person(String name, int age) {
        if (!isAge(age)) {
            throw new IllegalArgumentException("illegal age: " + age);
        }

        this.name = name;
        this.age = age;
    }

    private boolean isAge(int age) {
        return age > 0 && age <= 120;
    }

    public Person(String name) {
        this(name, 30);
    }

    public String sayHello() {
        return "Hello, I'm " + name + ", " + age + " years old";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
