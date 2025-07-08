package com.spring2025.codingbat.nuta.string1.tim.warmup1;

public class Warmup1 {

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile && bSmile){
            return true;
        }
        if(!aSmile && !bSmile){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Warmup1 obj = new Warmup1();
        System.out.println(obj.monkeyTrouble(false, true));
    }
}
