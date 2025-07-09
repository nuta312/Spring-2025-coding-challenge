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

}
