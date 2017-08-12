package com.bvan.oop.lessons1_2.student;

/**
 * @author bvanchuhov
 */
public class Student { // DTO - Data Transfer Object

    private String name;
    private String email;
    private String group;
    private int level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", group='" + group + '\'' +
                ", level=" + level +
                '}';
    }
}
