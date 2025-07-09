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
    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }
    public int[] reverse3(int[] nums) {

        return new int[]{nums[2],nums[1],nums[0]};

    }
    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        return new int[]{max, max, max};

    }
    public int sum2(int[] nums) {
        int sum = 0;
        for(int i =0; i<nums.length;i++){
            if(nums.length <1){
                return 0;
            }
            if(nums.length<2){
                sum += nums[i];
            }else {
                sum = nums[0]+nums[1];
            }

        }
        return sum;
    }
    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1],b[1]};

    }
    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0],nums[nums.length-1]};
    }
}
