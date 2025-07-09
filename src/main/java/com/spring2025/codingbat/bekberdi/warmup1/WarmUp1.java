package com.spring2025.codingbat.bekberdi.warmup1;

public class WarmUp1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && !(bSmile)){
            return false;
        }else if(!(aSmile) && bSmile){
            return false;
        }else {
            return true;
        }
    }
}
