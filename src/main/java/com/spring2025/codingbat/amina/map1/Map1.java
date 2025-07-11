package com.spring2025.codingbat.amina.map1;
import java.util.Map;
/**
 * @author Amina
 */
public class Map1 {
    /**
     Task 1 – mapBully

     Modify and return the given map as follows:
     if the key "a" has a value, set the key "b" to have that value,
     and set the key "a" to have the value "".
     Basically "b" is a bully, taking the value and replacing it with the empty string.

     mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
     mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
     mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
     */
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }

    /**
     Task 2 – topping1

     Given a map of food keys and topping values, modify and return the map as follows:
     if the key "ice cream" is present, set its value to "cherry".
     In all cases, set the key "bread" to have the value "butter".

     topping1({"ice cream": "peanuts"}) → {"bread": "butter", "ice cream": "cherry"}
     topping1({}) → {"bread": "butter"}
     topping1({"pancake": "syrup"}) → {"bread": "butter", "pancake": "syrup"}
     */
    public Map<String, String> topping1(Map<String, String> map) {
        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");
        return map;
    }

    /**
     Task 3 – mapAB2

     Modify and return the given map as follows:
     if the keys "a" and "b" are both in the map and have equal values, remove them both.

     mapAB2({"a": "aaa", "b": "aaa", "c": "cake"}) → {"c": "cake"}
     mapAB2({"a": "aaa", "b": "bbb"}) → {"a": "aaa", "b": "bbb"}
     mapAB2({"a": "aaa", "b": "bbb", "c": "aaa"}) → {"a": "aaa", "b": "bbb", "c": "aaa"}
     */
    public Map<String, String> mapAB2(Map<String, String> map) {
        if (map.containsKey("a") && map.containsKey("b") &&
                map.get("a").equals(map.get("b"))) {
            map.remove("a");
            map.remove("b");
        }
        return map;
    }

    /**
     Task 4 – mapShare

     Modify and return the given map as follows:
     if the key "a" has a value, set the key "b" to have that same value.
     In all cases remove the key "c", leaving the rest of the map unchanged.

     mapShare({"a": "aaa", "b": "bbb", "c": "ccc"}) → {"a": "aaa", "b": "aaa"}
     mapShare({"b": "xyz", "c": "ccc"}) → {"b": "xyz"}
     mapShare({"a": "aaa", "c": "meh", "d": "hi"}) → {"a": "aaa", "b": "aaa", "d": "hi"}
     */
    public Map<String, String> mapShare(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
