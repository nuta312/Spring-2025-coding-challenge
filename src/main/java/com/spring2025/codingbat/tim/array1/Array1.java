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
    public boolean sameFirstLast(int[] nums) {
        if(nums.length>=1){
            return nums[0] == nums[nums.length-1] ;
        }
        return false;
    }
    public int[] makePi() {
        return new int[] {3, 1, 4};



    }
    public boolean commonEnd(int[] a, int[] b) {
        if(a.length>=1 && b.length>=1){
            return a[0] == b[0]||a[a.length-1] == b[b.length-1];
        }
        return false;
    }
    public int sum3(int[] nums) {
        return nums[0] + nums[1]+ nums[2];
    }
}
