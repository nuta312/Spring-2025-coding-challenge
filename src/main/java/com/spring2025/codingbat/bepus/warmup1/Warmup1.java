package com.spring2025.codingbat.bepus.warmup1;
// @Begimai

public class Warmup1 {
    public static void main(String[] args) {
    }

   // The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == true && vacation == false){
            return false;
        }else{
            return true;
        }

        // We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            if (aSmile == true && bSmile == false){
                return false;
            }else if (aSmile == false && bSmile == true){
                return false;
            }else{
                return true;
            }
        }

    }

}
