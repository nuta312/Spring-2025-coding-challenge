package com.spring2025.codingbat.janara.warmup1;

public class Warmup1 {

    /**
     * @author Janara
     */
    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     *
     *
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return(!weekday|| vacation) ?true:false;
    }
    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     *
     *
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     */
    public int diff21(int n) {
        if(n<=21){
            return Math.abs(21-n);
        }else{
            return Math.abs(n-21)*2;
        }
    }
/**
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
 *
 *
 * parrotTrouble(true, 6) → true
 * parrotTrouble(true, 7) → false
 * parrotTrouble(false, 6) → false
 */
public boolean parrotTrouble(boolean talking, int hour) {
    if(talking && (hour <7 || hour > 20)){
        return true;
    }else{
        return false;
    }
}
    /**
     *
     Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.


     makes10(9, 10) → true
     makes10(9, 9) → false
     makes10(1, 9) → true
     */
    public boolean makes10(int a, int b) {
        if(a==10||b==10 ||(a+b==10)){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
     *
     *
     * nearHundred(93) → true
     * nearHundred(90) → true
     * nearHundred(89) → false
     */
    public boolean nearHundred(int n) {
        if((Math.abs(100-n)<=10)|| Math.abs(200 -n)<= 10){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
     *
     *
     * posNeg(1, -1, false) → true
     * posNeg(-1, 1, false) → true
     * posNeg(-4, -5, true) → true
     */
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }
/**
 *
 Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.


 notString("candy") → "not candy"
 notString("x") → "not x"
 notString("not bad") → "not bad"
 */
public String notString(String str) {
    if(str.startsWith("not")){
        return str;
    }else{
        return "not "+str;
    }
}
/**
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 *
 *
 * missingChar("kitten", 1) → "ktten"
 * missingChar("kitten", 0) → "itten"
 * missingChar("kitten", 4) → "kittn"
 */
public String missingChar(String str, int n) {
    StringBuilder sb1 = new StringBuilder(str);
    return (str.length() > n && n >= 0)? sb1.deleteCharAt(n).toString() : str;
}
/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 *
 *
 * frontBack("code") → "eodc"
 * frontBack("a") → "a"
 * frontBack("ab") → "ba"
 */
public String frontBack(String str) {
    return(str.length()>1)? str.substring(str.length()-1)+str.substring(1,str.length()-1)+str.substring(0,1):str;
}
/**
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.
 *
 *
 * front3("Java") → "JavJavJav"
 * front3("Chocolate") → "ChoChoCho"
 * front3("abc") → "abcabcabc"
 */
public String front3(String str) {
    String front = str.length() < 3 ? str : str.substring(0, 3);
    return front + front + front;
}
/**
 * Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
 *
 *
 * backAround("cat") → "tcatt"
 * backAround("Hello") → "oHelloo"
 * backAround("a") → "aaa"
 */
public String backAround(String str) {
    char lastChar = str.charAt(str.length() - 1);
    return lastChar + str + lastChar;
}
/**
 *
 Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod


 or35(3) → true
 or35(10) → true
 or35(8) → false
 */
public boolean or35(int n) {
    return (n % 3 == 0 || n % 5 == 0);
}
/**
 *
 Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


 front22("kitten") → "kikittenki"
 front22("Ha") → "HaHaHa"
 front22("abc") → "ababcab"
 */
public String front22(String str) {
    String front = str.length() < 2 ? str : str.substring(0, 2);
    return front + str + front;
}
/**
 *
 Given a string, return true if the string starts with "hi" and false otherwise.


 startHi("hi there") → true
 startHi("hi") → true
 startHi("hello hi") → false
 */
public boolean startHi(String str) {
    return str.startsWith("hi");
}
/**
 *
 Given two temperatures, return true if one is less than 0 and the other is greater than 100.


 icyHot(120, -1) → true
 icyHot(-1, 120) → true
 icyHot(2, 120) → false
 */
public boolean icyHot(int temp1, int temp2) {
    return( temp1 < 0 && temp2>100)||(temp1>100&& temp2<0)? true:false;
}

}
}
