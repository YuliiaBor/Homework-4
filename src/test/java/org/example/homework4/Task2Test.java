package org.example.homework4;

import junit.framework.TestCase;

import java.util.List;

import static org.example.homework4.Task2.*;

public class Task2Test extends TestCase {

    public void testRemoveDuplicatesFromCollection() {
        assertEquals(3, removeDuplicatesFromCollection(List.of(1, 1, 2, 3, 3)).size());
    }
}