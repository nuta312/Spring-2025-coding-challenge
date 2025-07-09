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
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }
    public int fixTeen(int n){
        if(n>=13 && n<=19 && n !=15 && n !=16){
            return 0;
        } else{
            return n;
        }
    }
    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);
    }
    public int round10(int num){

        if(num%10>=5){
            num = (num/10 +1)*10;
        }else{
            num = (num/10)*10;
        }
        return num;
    }
    public boolean closeFar(int a, int b, int c) {
        int diff1 = Math.abs(a-b);
        int diff2 = Math.abs(a-c);
        int diff3 = Math.abs(b-c);
        int far = Math.max(diff1,diff2);
        int close = Math.min(diff1,diff2);
        if(close<2 && far>=2 && diff3>=2){
            return true;
        }
        // if(diff1 >= 0 && diff1<2 && diff2>2){
        //   return true;
        // }
        // if(diff2 >= 0 && diff2<2 && diff1>2){
        //   return true;
        // }
        return false;
    }
    public int blackjack(int a, int b) {
        int max = Math.max(a,b);
        int min = Math.min(a,b);
        if(a >21 && b > 21){
            return 0;
        }
        if(max<=21){
            return max;
        }

        return min;

    }
    public boolean evenlySpaced(int a, int b, int c) {
        int maxVal = Math.max(a,b);
        int max = Math.max(maxVal,c);
        int minVal = Math.min(a,b);
        int min = Math.min(minVal,c);
        int middle;
        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            middle = a;
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            middle = b;
        } else {
            middle = c;
        }
        int diff1 = Math.abs(max - middle);
        int diff2 = Math.abs(middle -min);
        //int diff3 = Math.abs(a-c);
        if(diff1 == diff2){
            return true;
        }

        return false;
    }
}
