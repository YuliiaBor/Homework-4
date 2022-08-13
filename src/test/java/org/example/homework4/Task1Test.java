package org.example.homework4;

import junit.framework.TestCase;
import java.util.Map;

import static org.example.homework4.Task1.getDictionary;

public class Task1Test extends TestCase {

    public void testGetDictionary() {
        assertEquals(Map.of("t", 2, "e", 1, "s", 1), getDictionary("test"));
    }
}