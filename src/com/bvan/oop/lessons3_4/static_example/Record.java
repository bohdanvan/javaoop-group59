package com.bvan.oop.lessons3_4.static_example;

/**
 * @author bvanchuhov
 */
public class Record {

    private static int recordsCount = 0;

    private final int id;
    private final String name;

    public Record(String name) {
        this.id = recordsCount++;
        this.name = name;
    }

    public static int getRecordsCount() {
        return recordsCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
