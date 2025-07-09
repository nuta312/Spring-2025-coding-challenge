package com.spring2025.codingbat.tim.logic2;

public class Logic2 {
    public static void main(String[] args) {
        Logic2 l = new Logic2();
        System.out.println(l.makeBricks(1,4,7));
    }
    public boolean makeBricks(int small, int big, int goal) {
        if(goal> big *5 +small) return false;
        if(goal%5 <= small) return true;
        return false;
    }
    public int loneSum(int a, int b, int c) {
        if(a != b && a !=c && b != c){
            return a + b +c;
        }
        if(a == b && a ==c && b == c){
            return 0;
        }
        if(a == b){
            return c;
        }
        if(a == c){
            return b;
        }
        return a;
    }
    public int luckySum(int a, int b, int c) {

        if(a == 13){
            return 0;
        }
        if(b ==13){
            return a;
        }
        if(c ==13){
            return a+b;
        }

        return a+b+c;
    }

}
