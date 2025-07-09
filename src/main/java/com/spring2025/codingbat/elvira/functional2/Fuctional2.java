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
}
