package com.bvan.oop.lessons1_2.student;

/**
 * @author bvanchuhov
 */
public class StudentRunner {

    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John");
        student.setEmail("john@gmail.com");
        student.setLevel(5);
        student.setGroup("Java OOP");

        System.out.println(student);
    }
}
