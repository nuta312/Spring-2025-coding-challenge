package com.spring2025.codingbat.zinaida.array1;

/*
@author Zinaida
 */
public class Array1 {

    /*
    Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.

   firstLast6([1, 2, 6]) → true
   firstLast6([6, 1, 2, 3]) → true
   firstLast6([13, 6, 1, 2, 3]) → false
     */
    public boolean firstLast6(int[] nums) {

        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } else return false;
    }

    /*
  Given an array of ints, return true if the array is length 1 or more, and the first element and the last
  element are equal.

 sameFirstLast([1, 2, 3]) → false
 sameFirstLast([1, 2, 3, 1]) → true
 sameFirstLast([1, 2, 1]) → true
     */
    public boolean sameFirstLast(int[] nums) {

        if (nums.length >= 1 && nums[0] == nums[nums.length - 1]) {
            return true;
        } else return false;
    }

}
