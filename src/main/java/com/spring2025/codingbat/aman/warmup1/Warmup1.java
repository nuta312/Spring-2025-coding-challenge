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
    // 4.
    public int diff21(int n) {
        if (n > 21 ) {
            return (n - 21)*2;
        } else {
            return 21 - n;
        }
    }
    // 5.
    public boolean parrotTrouble(boolean talking, int hour) {
        if (hour < 7 || hour >20){
            if(talking){
                return true;
            }
        }
        return false;
    }
    // 6.
    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10 || a+b == 10);
    }
    // 7.
    public boolean nearHundred(int n) {
        return (Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10);
    }
    // 8.
    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return (a < 0 && b > 0) || (a > 0 && b < 0);
        }
    }
    // 9.
    public String notString(String str) {
        if (str.startsWith("not")){
            return str;
        } else
            return "not " + str;
    }
    // 10.
    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n + 1);
    }
    // 11.
    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        }
        String mid = str.substring(1,str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
    // 12.
    public String front3(String str) {
        if (str.length() <=3 ){
            return str + str + str ;
        }
        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }
    // 13.
    public String backAround(String str) {
        String last = str.substring(str.length()-1);
        return last + str + last;
    }
    // 14.
    public boolean or35(int n) {
        if (n % 3 == 0 || n % 5 == 0){
            return true;
        }else
            return false;
    }
    // 15.
    public String front22(String str) {
        if(str.length() <= 2){
            return str + str + str;
        }
        String front2 = str.substring(0,2);
        return front2 + str + front2;
    }
    // 16.
    public boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }
        return false;
    }
    // 17.
    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100){
            return true;
        } else if (temp2 <0 && temp1 > 100){
            return true;
        }
        return false;
    }
    // 18.
    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }
    // 19.
    public boolean hasTeen(int a, int b, int c) {
        return  ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }
    // 20.
    public boolean loneTeen(int a, int b) {
        boolean aTeen = a >= 13 && a <=19;
        boolean bTeen = b >= 13 && b <=19;
        return ((!aTeen) && (bTeen)) || ((aTeen) && (!bTeen));
    }
    // 21.
    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1,4).equals("del")){
            return str.replace("del","");
        }
        return str;
    }
    // 22.
    public boolean mixStart(String str) {
        if (str.length() < 3) {
            return false;
        }
        String str1 = str.substring(1,3);
        if (str1.equals("ix")){
            return true;
        }
        return false;
    }
    // 23.
    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }
        return result;
    }
    // 24.
    public int intMax(int a, int b, int c) {
        int max;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }
    // 25.
    public int close10(int a, int b) {
        int a1 = Math.abs(a - 10);
        int b1 = Math.abs(b - 10);
        if (a1 < b1){
            return a;
        }
        if (b1 < a1){
            return b;
        }
        return 0;
    }
    // 26.
    public boolean in3050(int a, int b) {
        boolean a1 = (a >= 30 && a <= 40) && (b >= 30 && b <= 40);
        boolean b1 = (a >= 40 && a <= 50) && (b >= 40 && b <= 50);
        if(a1){
            return a1;
        } else
            return b1;
    }
    // 27.
    public int max1020(int a, int b) {
        boolean a1 = a >= 10 && a <= 20;
        boolean b1 = b >= 10 && b <= 20;

        if (a1 && b1) {
            return Math.max(a, b);
        }
        if (a1) {
            return a;
        }
        if (b1) {
            return b;
        }
        return 0;
    }
    // 28.
    public boolean stringE(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == 'e'){
                counter++;
            }
        }
        return counter >= 1 && counter <= 3;
    }
    // 29.
    public boolean lastDigit(int a, int b) {
        if (a % 10 == (b%10)){
            return true;
        }
        return false;
    }
    // 30.
    public String endUp(String str) {
        if (str.length() < 3){
            return str.toUpperCase();
        }
        int st1 = str.length()-3;
        String front = str.substring(0,st1);
        String back = str.substring(st1);
        return front + back.toUpperCase();
    }






 }
