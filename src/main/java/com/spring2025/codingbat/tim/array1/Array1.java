package com.spring2025.codingbat.tim.array1;

public class Array1 {
    public static void main(String[] args) {
        Array1 a = new Array1();
        System.out.println(a.firstLast6(new int[]{12, 2, 3}));
    }
    public boolean firstLast6(int[] nums) {
        for(int i =0;i<nums.length;i++){
            if(nums[0] ==6 || nums[nums.length-1]==6){
                return true;
            }

        }
        return false;
    }

}
