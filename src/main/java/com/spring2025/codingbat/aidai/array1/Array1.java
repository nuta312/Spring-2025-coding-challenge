package com.spring2025.codingbat.aidai.array1;

public class Array1 {
    /**
     * @author Aidai
     */
    /**
     * Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
     *
     *
     * firstLast6([1, 2, 6]) → true
     * firstLast6([6, 1, 2, 3]) → true
     * firstLast6([13, 6, 1, 2, 3]) → false
     */
    public boolean firstLast6(int[] nums) {
        if (nums[0] == 6) {
            return true;
        } else if (nums[nums.length - 1] == 6) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
     *
     *
     * sameFirstLast([1, 2, 3]) → false
     * sameFirstLast([1, 2, 3, 1]) → true
     * sameFirstLast([1, 2, 1]) → true
     */
    public boolean sameFirstLast(int[] nums) {
        if (nums.length < 1) {
            return false;
        }
        if (nums[0] == nums[nums.length - 1]) {
            return true;
        }
        return false;
    }
    /**
     * Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.
     *
     *
     * makePi() → [3, 1, 4]
     */
    public int[] makePi() {
        int nums [] ={3,1,4};
        return nums;
    }
    /**
     * Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. Both arrays will be length 1 or more.
     *
     *
     * commonEnd([1, 2, 3], [7, 3]) → true
     * commonEnd([1, 2, 3], [7, 3, 2]) → false
     * commonEnd([1, 2, 3], [1, 3]) → true
     */
    public boolean commonEnd(int[] a, int[] b) {
        if (a[0] == b[0]) {
            return true;
        }
        if (a[a.length - 1] == b[b.length - 1]) {
            return true;
        }
        return false;
    }
    /**
     * Given an array of ints length 3, return the sum of all the elements.
     *
     *
     * sum3([1, 2, 3]) → 6
     * sum3([5, 11, 2]) → 18
     * sum3([7, 0, 0]) → 7
     */
    public int sum3(int[] nums) {
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }
    /**
     * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
     *
     *
     * rotateLeft3([1, 2, 3]) → [2, 3, 1]
     * rotateLeft3([5, 11, 9]) → [11, 9, 5]
     * rotateLeft3([7, 0, 0]) → [0, 0, 7]
     */
    public int[] rotateLeft3(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length -1];
        return new int[] {  middle, last,first };
    }
    /**
     * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.
     *
     *
     * reverse3([1, 2, 3]) → [3, 2, 1]
     * reverse3([5, 11, 9]) → [9, 11, 5]
     * reverse3([7, 0, 0]) → [0, 0, 7]
     */
    public int[] reverse3(int[] nums) {
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
        return new int[]{last, middle, first};
    }
    /**
     * Given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value. Return the changed array.
     *
     *
     * maxEnd3([1, 2, 3]) → [3, 3, 3]
     * maxEnd3([11, 5, 9]) → [11, 11, 11]
     * maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[nums.length - 1]);
        return new int[] {max,max,max};
    }
    /**
     * Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
     *
     *
     * sum2([1, 2, 3]) → 3
     * sum2([1, 1]) → 2
     * sum2([1, 1, 1, 1]) → 2
     */
    public int sum2(int[] nums) {
        if (nums.length < 1) {
            return 0;
        }
        if (nums.length < 2) {
            return nums[0];
        }
        return nums[0] + nums[1];
    }
    /**
     * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
     *
     *
     * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
     * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
     * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
     */
    public int[] middleWay(int[] a, int[] b) {
        int middleA = a[a.length /2];
        int middleB = b[b.length/2];
        return new int[]{middleA,middleB};
    }
    /**
     * Given an array of ints, return a new array length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
     *
     *
     * makeEnds([1, 2, 3]) → [1, 3]
     * makeEnds([1, 2, 3, 4]) → [1, 4]
     * makeEnds([7, 4, 6, 2]) → [7, 2]
     */
    public int[] makeEnds(int[] nums) {
        int numsFirst = nums[0];
        int numsLast = nums[nums.length - 1];
        return new int[]{numsFirst, numsLast};
    }
    /**
     * Given an int array length 2, return true if it contains a 2 or a 3.
     *
     *
     * has23([2, 5]) → true
     * has23([4, 3]) → true
     * has23([4, 5]) → false
     */
    public boolean has23(int[] nums) {
        return (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3);
    }
}
