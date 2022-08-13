package org.example.homework4;

import java.util.*;

public class Bonus {

    public static final String VALUE_NOT_ENOUGH_FOR_MAP = "Value is not enough for the Map";
    public static final String KEY_NOT_ENOUGH_FOR_MAP = "Key is not enough for the Map";

    public static <K, V> SortedMap<K, V> getMapFromLists(List<K> keys, List<V> values) {
        SortedMap<K, V> map = new TreeMap<>();
        for (int i = 0; i < keys.size(); i++) {
            if (i >= values.size() - 1) {
                map.put(keys.get(i), null);
            } else {
                map.put(keys.get(i), values.get(i));
            }
        }
        return map;
    }

    public static <K, V> SortedMap<K, V> getMapFromListsWithExceptions(List<K> keys, List<V> values) {
        SortedMap<K, V> map = new TreeMap<>();
        if (keys.size() == values.size()) {
            for (int i = 0; i < keys.size(); i++) {
                map.put(keys.get(i), values.get(i));
            }
            return map;
        } else if (keys.size() > values.size()) {
            throw new RuntimeException(VALUE_NOT_ENOUGH_FOR_MAP);
        } else {
            throw new RuntimeException(KEY_NOT_ENOUGH_FOR_MAP);
        }
    }
}
