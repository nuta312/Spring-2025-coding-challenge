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

    /**
     Task 3 – wordMultiple

     Return a Map with each string and a boolean value:
     true if it appears 2 or more times, false otherwise.

     wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
     wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
     wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */
    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String str : strings) {
            if (!map.containsKey(str)) {
                map.put(str, false);
            } else {
                map.put(str, true);
            }
        }
        return map;
    }

    /**
     Task 4 – wordLen

     Given an array of strings, return a Map<String, Integer>
     containing a key for every different string in the array,
     and the value is that string's length.

     wordLen(["a", "bb", "a", "bb"]) → {"bb": 2, "a": 1}
     wordLen(["this", "and", "that", "and"]) → {"that": 4, "and": 3, "this": 4}
     wordLen(["code", "code", "code", "bug"]) → {"code": 4, "bug": 3}
     */
    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            map.put(str, str.length());
        }
        return map;
    }

    /**
     Task 4 – firstChar

     Return a Map where each key is the first char of strings in the array,
     and the value is all those strings concatenated in order.

     firstChar(["salt", "tea", "soda", "toast"]) → {"s": "saltsoda", "t": "teatoast"}
     firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"]) → {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
     firstChar([]) → {}
     */
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            String key = str.substring(0, 1);
            map.put(key, map.getOrDefault(key, "") + str);
        }
        return map;
    }

    /**
     Task 5 – allSwap

     Swap strings if their first characters match.
     Each character can only be used once for swapping.

     allSwap(["ab", "ac"]) → ["ac", "ab"]
     allSwap(["ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"]) → ["ay", "by", "cy", "cx", "bx", "ax", "azz", "aaa"]
     allSwap(["ax", "bx", "ay", "by", "ai", "aj", "bx", "by"]) → ["ay", "by", "ax", "bx", "aj", "ai", "by", "bx"]
     */
    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            if (map.containsKey(key)) {
                int prevIndex = map.get(key);
                String temp = strings[i];
                strings[i] = strings[prevIndex];
                strings[prevIndex] = temp;
                map.remove(key);
            } else {
                map.put(key, i);
            }
        }

        return strings;
    }

    /**
     Task 7 – pairs

     Return a Map where each key is the first letter of a string,
     and the value is the last letter of that string.
     If a key appears more than once, overwrite.

     pairs(["code", "bug"]) → {"b": "g", "c": "e"}
     pairs(["man", "moon", "main"]) → {"m": "n"}
     pairs(["man", "moon", "good", "night"]) → {"g": "d", "m": "n", "n": "t"}
     */
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String str : strings) {
            map.put(str.substring(0, 1), str.substring(str.length() - 1));
        }
        return map;
    }


}
