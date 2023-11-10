package de.ait.homework37;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Alex");
        stringSet.add("Anna");
        stringSet.add("Max");

        System.out.println(stringSet.size());

        System.out.println(stringSet.isEmpty());

        stringSet.remove("Max");
    }
}
