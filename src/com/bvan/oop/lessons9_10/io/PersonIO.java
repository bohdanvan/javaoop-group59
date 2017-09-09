package com.bvan.oop.lessons9_10.io;

import com.bvan.oop.common.Person;

import java.io.*;

/**
 * @author bvanchuhov
 */
public class PersonIO {

    public static void main(String[] args) {
        String fileName = "files/people.csv";

        try {
            Person person = readPersonFromFile(fileName);
            System.out.println(person);
        } catch (IOException e) {
            System.out.println("Sorry, IO error: " + e.getMessage());
        } catch (IllegalFormatException e) {
            System.out.println("Sorry, format error: " + e.getMessage());
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Person readPersonFromFileOldVersion(String fileName) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(fileName));
            String line = reader.readLine();
            return parsePerson(line);
        } finally {
            closeReader(reader);
        }
    }

    /**
     * @throws IOException
     * @throws IllegalFormatException
     */
    private static Person readPersonFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line = reader.readLine();
            return parsePerson(line);
        }
    }

    private static void closeReader(BufferedReader reader) {
        try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @throws IllegalFormatException
     */
    private static Person parsePerson(String s) {
        String[] tokens = s.split(";");
        if (tokens.length < 2) {
            throw new IllegalFormatException("should be 2 values: " + s);
        }

        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);
        return new Person(name, age);
    }
}
