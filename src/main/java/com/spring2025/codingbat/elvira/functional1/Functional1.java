package com.spring2025.codingbat.elvira.functional1;

/*
@author Elvira Ashyralieva
 */

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {

    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(n -> n * 2).collect(Collectors.toList());
    }

    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(n -> n * n).collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {
        return strings.stream().map(s -> s + "*").collect(Collectors.toList());
    }
}
