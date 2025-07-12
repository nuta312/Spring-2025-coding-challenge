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


    /**
     Task 2 – wordCount

     Classic word-count algorithm:
     return a Map with each string and the number of times it appears.

     wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
     wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
     wordCount(["c", "c", "c", "c"]) → {"c": 4}
     */
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        return map;
    }

}
