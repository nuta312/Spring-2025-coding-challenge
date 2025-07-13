package com.spring2025.Janara;

import java.util.List;
import java.util.stream.Collectors;

public class functional1 {
    /**
     * author janara
     */
    /**
     *
     Given a list of integers, return a list where each integer is multiplied by 2.


     doubling([1, 2, 3]) → [2, 4, 6]
     doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
     doubling([]) → []
     */
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n->n*2)
                .collect(Collectors.toList());
    }
    /**
     * Given a list of integers, return a list where each integer is multiplied with itself.
     *
     *
     * square([1, 2, 3]) → [1, 4, 9]
     * square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
     * square([]) → []
     */
    public List<Integer> square(List<Integer> nums) {
        return nums.stream()
                .map(s->s*s)
                .collect(Collectors.toList());


    }

}
