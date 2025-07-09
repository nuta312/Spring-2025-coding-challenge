package com.spring2025.codingbat.tamara.warmur1;

public class Warmur_1 {
    public static void main(String[] args) {
        Warmur_1 speepinObj = new Warmur_1();


        System.out.println(speepinObj.sleepin(false, false));
        System.out.println(speepinObj.sleepin(true, false));
        System.out.println(speepinObj.sleepin(false, true));
        System.out.println(speepinObj.monkeyTrouble(true, true));
        System.out.println(speepinObj.monkeyTrouble(false, false));
        System.out.println(speepinObj.sumDouble(1,2));
        System.out.println(speepinObj.sumDouble(2,2));
        System.out.println(speepinObj.diff21(17));
        System.out.println(speepinObj.parrotTrouble(true, 7));
        System.out.println(speepinObj.makes10(9,10));
        System.out.println(speepinObj.makes10(9,9));
        System.out.println(speepinObj.nearHundred(89));
        System.out.println(speepinObj.postNeg(1, -1, false));
        System.out.println(speepinObj.postNeg(-1, 1, false));
        System.out.println(speepinObj.postNeg(-4, -5, true));
        System.out.println(speepinObj.notString("candy"));
        System.out.println(speepinObj.missingChar("kitten", 1));
        System.out.println(speepinObj.frontBack("code"));
        System.out.println(speepinObj.front3("Chocolate"));


      /* The parameter weekday is true if it is a weekday, and the parameter vacation
       is true if we are on vacation. We sleep in if it is not a weekday
       or we're on vacation. Return true if we sleep in.
sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */
    }
    public boolean sleepin(boolean weekday, boolean vacation){
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
    }
    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum*2;
        }
        return sum;
    }
    public int diff21(int n){
        if(n<=21){
            return 21-n;
        }else {
            return (n-21)*2;
        }
    }
    public boolean parrotTrouble(boolean talking, int hour){
        return (talking && (hour < 7 || hour > 20));
    }
    public boolean makes10(int a, int b){
        return (a==10 || b==10 || a+b==10);
    }
    public boolean nearHundred( int n){
      return Math.abs(n-100) <=10 || Math.abs(n-200)<=10;
    }
    public boolean postNeg (int a, int b, boolean negative){
        if (negative) {
            return a < 0 && b < 0;
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }
public String notString(String str) {
    if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        return str;
    }
    return "not" + str;
}
public String missingChar(String str, int n){
        return str.substring(0,n) + str.substring(n+1);
}
public String frontBack(String str){
        if(str.length()<=1){
            return str;
        }
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
}
    public String front3(String str) {
        String front;
        if(str.length()>=3){
            front = str.substring(0,3);
        }
        else{
            front = str;

        }
        return front +front+front;
    }
}


