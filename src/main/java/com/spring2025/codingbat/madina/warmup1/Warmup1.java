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

}
