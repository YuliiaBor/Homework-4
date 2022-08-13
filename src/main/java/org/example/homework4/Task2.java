package org.example.homework4;

import java.util.Collection;
import java.util.HashSet;

public class Task2 {

    public static <T> Collection<T> removeDuplicatesFromCollection(Collection<T> collection) {
        return new HashSet<T>(collection);
    }
}
