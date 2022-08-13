package org.example.homework4;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.SortedMap;

import static org.example.homework4.Bonus.*;

public class BonusTest extends TestCase {

    private static final String KEY_1 = "Key_1";
    private static final String KEY_2 = "Key_2";
    private static final String KEY_3 = "Key_3";
    private static final String KEY_4 = "Key_4";
    private static final String KEY_5 = "Key_5";
    private static final String KEY_6 = "Key_6";
    private static final String KEY_7 = "Key_7";
    private static final Integer VALUE_1 = 1;
    private static final Integer VALUE_2 = 2;
    private static final Integer VALUE_3 = 3;
    private static final Integer VALUE_4 = 4;
    private static final Integer VALUE_5 = 5;

    private List<String> keysEquals;
    private List<String> keysMore;
    private List<String> keysLess;
    private List<Integer> values;

    @Before
    public void setUp() {
        keysEquals = List.of(KEY_1, KEY_2, KEY_3, KEY_4, KEY_5);
        keysMore = List.of(KEY_1, KEY_2, KEY_3, KEY_4, KEY_5, KEY_6, KEY_7);
        keysLess = List.of(KEY_1, KEY_2, KEY_3);
        values = List.of(VALUE_1, VALUE_2, VALUE_3, VALUE_4, VALUE_5);
    }

    @Test
    public void testGetMapFromListsKeyIsEqualsOrLower() {
        assertEquals(values.size(), getMapFromLists(keysEquals, values).size());
    }

    @Test
    public void testGetMapFromListsKeyIsHigher() {
        SortedMap<String, Integer> map = getMapFromLists(keysMore, values);

        assertEquals(keysMore.size(), map.size());
        assertNull(map.get(KEY_6));
        assertNull(map.get(KEY_7));
    }

    @Test
    public void testGetMapFromListsWithExceptionsKeyIsBiggerValue() {
        try {
            getMapFromListsWithExceptions(keysMore, values);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), VALUE_NOT_ENOUGH_FOR_MAP);
        }
    }

    @Test
    public void testGetMapFromListsWithExceptionsKeyIsEqualsValue() {
        assertEquals(keysEquals.size(), getMapFromListsWithExceptions(keysEquals, values).size());
        assertEquals(values.size(), getMapFromListsWithExceptions(keysEquals, values).size());
    }

    @Test
    public void testGetMapFromListsWithExceptionsIsLowerValue() {
        try {
            getMapFromListsWithExceptions(keysLess, values);
        } catch (RuntimeException e) {
            assertEquals(e.getMessage(), KEY_NOT_ENOUGH_FOR_MAP);
        }
    }
}