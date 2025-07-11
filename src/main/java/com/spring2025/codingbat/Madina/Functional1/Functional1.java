package com.spring2025.codingbat.Madina.Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {
        /*
        @author Madina
         */
    }
    /*Given a list of integers, return a list where each integer is multiplied by 2.
    doubling([1, 2, 3]) → [2, 4, 6]
    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    doubling([]) → []
     */
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
}
