package com.spring2025.codingbat.elvira.functional2;

/*
@author Elvira Ashyralieva
 */

import java.util.List;
import java.util.stream.Collectors;

public class Fuctional2 {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter( n -> n >= 0).collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(n -> n % 10 != 9).collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(n -> n < 13 || n > 19).collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(s -> !s.contains ("z")).collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(l -> l.length() < 4).collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings.stream().filter(w -> w.length() != 3 && w.length() != 4).collect(Collectors.toList());
    }
}
