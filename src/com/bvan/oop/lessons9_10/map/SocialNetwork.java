package com.bvan.oop.lessons9_10.map;

import com.bvan.oop.common.Person;

import java.util.*;

/**
 * @author bvanchuhov
 */
public class SocialNetwork {

    public static void main(String[] args) {
        Map<Long, Person> idToUserMap = new HashMap<>();

        idToUserMap.put(100L, new Person("Taras", 25));
        idToUserMap.put(2000L, new Person("Lesya", 20));
        idToUserMap.put(500L, new Person("Ivan", 30));
        idToUserMap.put(300L, null);

        idToUserMap.put(100L, new Person("Ilya", 28));

        System.out.println(idToUserMap.get(100L));
        System.out.println();

        Set<Long> keySet = idToUserMap.keySet();
        Collection<Person> values = idToUserMap.values();
        Set<Map.Entry<Long, Person>> entries = idToUserMap.entrySet();
        for (Map.Entry<Long, Person> entry : entries) {
            Long id = entry.getKey();
            Person user = entry.getValue();
            System.out.println(id + " -> " + user);
        }

    }
}
