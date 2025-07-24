package com.spring2025.codingbat.aziz.warmup1;

public class Warmup1 {


    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(weekday == false || vacation == true){
            return true;
        }else{
            return false;
        }
    }


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if(aSmile == bSmile){
            return true;
        }
        return false;
    }

    public int sumDouble(int a, int b) {
        if(a != b){
            return a + b;
        }else {
            return (a + b) * 2;
        }
    }


    public int diff21(int n) {
        if(n <= 21){
            return 21 - n;
        }else{
            return (n - 21) * 2;
        }
    }


    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }


    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || a+b == 10){
            return true;
        }else{
            return false;
        }
    }


    public boolean nearHundred(int n) {
        if(n >= 90 && n <= 110 || n >= 190 && n <= 210){
            return true;
        }else{
            return false;
        }
    }


    public boolean posNeg(int a, int b, boolean negative) {
        if(negative){
            return (a < 0 && b < 0);
        }else{
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }


    public String notString(String str) {
        if(str.startsWith("not")){
            return str;
        }else {
            return "not " + str;
        }
    }


    public String missingChar(String str, int n) {
        String result = str.substring(0, n) + str.substring(n + 1, str.length());
        return result;
    }


    public String frontBack(String str) {
        if (str.length() <= 1){
            return str;
        }else {
            String mid = str.substring(1, str.length() - 1);
            return str.charAt(str.length() -1 ) + mid + str.charAt(0);
        }
    }


    public String front3(String str) {
        if (str.length() < 3){
            return str + str+ str;
        }else {
            String str2 = str.substring(0,3);
            return str2 + str2+ str2;
        }
    }


    public String backAround(String str) {
        String lastChar = str.substring(str.length()-1);
        return lastChar + str + lastChar;
    }


    public boolean or35(int n) {
        if(n % 3 == 0 || n % 5 == 0){
            return true;
        }else{
            return false;
        }
    }


    public String front22(String str) {
        String front;
        if(str.length() < 2){
            front = str;
        }else {
            front = str.substring(0,2);
        }return front + str + front;
    }


    public boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }else {
            return false;
        }
    }


    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0);
    }


    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
    }


    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19 || b >= 13 && b <=19 || c >= 13 && c <= 19);
    }


    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }


    public String delDel(String str) {
        if (str.length() >= 4){
            if(str.substring(1,4).equals("del")){
                return str.charAt(0)+str.substring(4,str.length());
            }
        }
        return str;
    }


    public boolean mixStart(String str) {
        if(str.length() >= 3){
            if(str.charAt(1)=='i' && str.charAt(2)=='x'){
                return true;
            }
        }
        return false;
    }


    public String startOz(String str) {
        String result = "";
        if(str.length()>=1 && str.charAt(0)=='o'){
            result += 'o';
        }
        if(str.length()>=2 && str.charAt(1)=='z'){
            result += 'z';
        }
        return result;
    }


    public int intMax(int a, int b, int c) {
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        return max;
    }

}
