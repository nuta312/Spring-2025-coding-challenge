package com.spring2025.codingbat.amina.map2;
import java.util.*;
/**
 * @author Amina
 */
public class Map2 {

    /**
     Task 1 – word0

     Given an array of strings, return a Map<String, Integer>
     containing a key for every different string in the array,
     always with the value 0.

     word0(["a", "b", "a", "b"]) → {"a": 0, "b": 0}
     word0(["a", "b", "a", "c", "b"]) → {"a": 0, "b": 0, "c": 0}
     word0(["c", "b", "a"]) → {"a": 0, "b": 0, "c": 0}
     */
    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, 0);
        }
        return map;
    }
}
