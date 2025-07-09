package com.spring2025.codingbat.madina.warmup1;

public class Warmup1 {
    public static void main(String[] args) {
        Warmup1 obj =new Warmup1();
        System.out.println(obj.sleepIn(false,false));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!(weekday) && (vacation)) {
            return true;
        } else if (weekday && !(vacation)) {
            return false;
        } else if (!(weekday) && vacation) {
            return true;
        } else {
            return true;
        }

    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        } return false;
    }
    public int sumDouble(int a, int b) {
        if (a == b){
            return 2*(a+b);
        } else {
            return a+b ;

        }

    }
    public int diff21(int n) {
        if (n <=21){
            return 21-n;
        } else {
            return (n - 21)*2;
        }
    }


}
