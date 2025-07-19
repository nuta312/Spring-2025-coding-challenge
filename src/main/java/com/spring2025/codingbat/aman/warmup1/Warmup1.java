package com.spring2025.codingbat.aman.warmup1;
 /**
@author Aman
 */
public class Warmup1 {
    // 1.
    public boolean sleepIn(boolean weekday , boolean vacation) {
        return !weekday || vacation;
    }
    // 2.
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        } if(!aSmile && !bSmile){
            return true;
        } else
            return false;
    }
    // 3.
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b){
            sum *= 2;
        }
        return sum;
    }




 }
