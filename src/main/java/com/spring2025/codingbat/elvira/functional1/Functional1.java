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
}
