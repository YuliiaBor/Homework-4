package org.example.homework4;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> getDictionary(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            String symbol = s.substring(i, i + 1);
            if (map.get(symbol) == null) {
                map.put(symbol, 1);
            } else {
                int count = map.get(symbol);
                map.put(symbol, count + 1);
            }
        }
        return map;
    }
}


