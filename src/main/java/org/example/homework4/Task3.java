package org.example.homework4;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Task3 {

    public static void main(String[] args) {
        List<String> shopOrders = List.of("45", "3", "6", "8", "92", "35", "2", "3", "45", "1", "15", "35");
        Set<String> treeSet = new TreeSet<>(shopOrders);
        Set<String> hashSet = new HashSet<>(shopOrders);

        System.out.println(treeSet);
        System.out.println(hashSet);
    }
}
