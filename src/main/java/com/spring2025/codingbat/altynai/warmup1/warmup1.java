package com.spring2025.codingbat.altynai.warmup1;

public class warmup1 {
    public static void main(String[] args) {

    }
    //The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
    //
    //
    //sleepIn(false, false) → true
    //sleepIn(true, false) → false
    //sleepIn(false, true) → true

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(! weekday || vacation){
            return true;
        }else{
            return false;

        }
    }

    //We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    //
    //
    //monkeyTrouble(true, true) → true
    //monkeyTrouble(false, false) → true
    //monkeyTrouble(true, false) → false

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if( aSmile && bSmile) {
            return true;
        }
        if(! aSmile && !bSmile){
            return true;
        }
        return false;
    }
}
