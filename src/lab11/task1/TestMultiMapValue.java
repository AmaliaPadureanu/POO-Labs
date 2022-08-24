package lab11.task1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TestMultiMapValue {
    private MultiMapValue<String, String> map;

    @BeforeEach
    public void setup() {
        map = new MultiMapValue<>();
    }

    @AfterEach
    public void clean() {
        map = null;
    }

    @Test
    public void testAddElementWithOneValue() {
        map.add("key", "value");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
    }

    @Test
    public void testAddElementWithMoreValues() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.size());
        Assertions.assertEquals(2, map.getValues("key").size());
    }

    @Test
    public void testAddTwoElements() {
        map.add("key", "value");
        map.add("key1", "value1");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(2, map.size());
        Assertions.assertEquals(1, map.getValues("key").size());
        Assertions.assertEquals(1, map.getValues("key1").size());
    }

    @Test
    public void testGetFirst() {
        map.add("key", "value1");
        map.add("key", "value2");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals("value1", map.getFirst("key"));
        Assertions.assertNotEquals("value2", map.getFirst("key"));
    }

    @Test
    public void testContainsKey() {
        map.add("key", "value");
        map.add("key1", "value1");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(true, map.containsKey("key"));
        Assertions.assertNotEquals(true, map.containsKey("key2"));
    }

    @Test
    public void testSize() {
        map.add("key", "value");
        map.add("key1", "value1");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(2, map.size());
    }

    @Test
    public void testRemoveKey() {
        map.add("key", "value");
        map.add("key1", "value1");
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(1, map.remove("key").size());
        Assertions.assertEquals(null, map.getValues("key"));
        Assertions.assertNotEquals(true, map.containsKey("key"));
    }

    @Test
    public void testAddAllWithList() {
        List<String> values = Arrays.asList("value1", "value2", "value3");
        map.addAll("key", values);
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(true, map.containsKey("key"));
        Assertions.assertEquals(3, map.getValues("key").size());
    }

    @Test
    public void testAddAllWithMultiMapValue() {
        MultiMapValue map2 = new MultiMapValue();
        map2.add("key", "value");
        map2.add("key1", "value1");
        map.addAll(map2);
        Assertions.assertFalse(map.isEmpty());
        Assertions.assertEquals(true, map.containsKey("key"));
        Assertions.assertEquals(true, map.containsKey("key1"));
        Assertions.assertEquals(2, map.size());
    }
}
