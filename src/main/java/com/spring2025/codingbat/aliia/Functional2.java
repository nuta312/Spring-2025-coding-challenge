package com.spring2025.codingbat.aliia;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author aliyaalymbekova
 */
public class Functional2 {

    //Given a list of integers, return a list of the integers, omitting any that are less than 0

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(n -> n >= 0).collect(Collectors.toList());
    }

    //Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n -> n % 10 != 9).collect(Collectors.toList());
    }

    //Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> !(n >= 13 && n <= 19)).collect(Collectors.toList());

    }

    //Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)

    public List<String> noZ(List<String> strings) {
        strings.removeIf(n -> n.contains("z"));
        return strings;
    }

    //Given a list of strings, return a list of the strings, omitting any string length 3 or 4.

    public List<String> no34(List<String> strings) {
        strings.removeIf(n -> n.length() == 3 || n.length() == 4 );
        return strings;
    }

    //Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.

    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(n -> (n * n) + 10);
        return nums.stream().filter(n -> n % 10 != 5 && n % 10 != 6).collect(Collectors.toList());
    }
}

