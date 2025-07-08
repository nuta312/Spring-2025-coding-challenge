package com.spring2025.codingbat.aliia.map2;

import java.util.*;

public class Map2 {

    public Map<String, Integer> word0(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();

        for (String s : strings) {
            map.put(s, 0);
        }

        return map;
    }

    public Map<String, Integer> wordLen(String[] strings) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, s.length());
        }

        return map;
    }

    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String s : strings) {
            map.put(String.valueOf(s.charAt(0)), String.valueOf(s.charAt(s.length() - 1)));
        }

        return map;
    }

    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> map = new TreeMap<>();

        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        return map;
    }

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new TreeMap<>();

        for (String s : strings) {
            String str = s.substring(0, 1);
            if (map.containsKey(str)) {
                String qwerty = map.get(str) + s;
                map.put(str, qwerty);
            } else {
                map.put(str, s);
            }
        }
        return map;
    }

    public String wordAppend(String[] strings) {
        String result = "";
        Map<String, Integer> map = new HashMap<>();

        for (String s : strings) {
            map.put(s, map.getOrDefault(s, 0) + 1);

            if (map.get(s) % 2 == 0) {
                result += s;
            }
        }

        return result;
    }

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new TreeMap<>();
        Map<String, Integer> map2 = new TreeMap<>();

        for (String str : strings) {
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }

        for (String key : map2.keySet()) {
            int value = map2.get(key);

            if (value >= 2) {
                map.put(key, true);
            } else {
                map.put(key, false);
            }
        }

        return map;
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i].substring(0, 1);
            if (map.containsKey(s)) {
                String temp = strings[i];
                strings[i] = strings[map.get(s)];
                strings[map.get(s)] = temp;
                map.remove(s);
            } else {
                map.put(s, i);
            }

        }
        return strings;
    }

    public String[] firstSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Set<String> swapped = new HashSet<>();

        for (int i = 0; i < strings.length; i++) {

            String s = strings[i].substring(0, 1);
            if (map.containsKey(s) && !swapped.contains(s)) {
                String temp = strings[i];
                strings[i] = strings[map.get(s)];
                strings[map.get(s)] = temp;
                swapped.add(s);
            } else {
                map.put(s, i);
            }

        }
        return strings;
    }
}
