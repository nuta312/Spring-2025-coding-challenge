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
    public int sumDouble(int a, int b) {
        if(a == b){
            return (a + b) * 2;
        }else {
            return a + b;
        }
    }
    public int diff21(int n) {
        int num = 21 - n;
        if (n > 21){
            num = (n - 21) * 2;
        }
        return num;
    }
    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && hour < 7){
            return true;
        } else if(talking && hour > 20){
            return true;
        } else{
            return false;

        }
    }
    public boolean makes10(int a, int b) {
        if (a ==10 || b == 10 || (a + b) == 10){
            return true;
        } else{
            return false;
        }
    }
    public boolean nearHundred(int n) {
        if (Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10) {
            return true;
        }else {
            return false;
        }
    }
    public boolean posNeg(int a, int b, boolean negative) {
        if(a > 0 && b < 0 && negative == false || a < 0 && b > 0 && negative == false){
            return true;
        }else if(negative == true && a < 0 && b < 0){
            return true;
        } else {
            return false;
        }
    }
    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }

        return "not " + str;
    }
    public String missingChar(String str, int n) {
        StringBuilder sb1 = new StringBuilder(str);
        sb1.deleteCharAt(n);
        String str1 = String.valueOf(sb1);
        return str1;
    }
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
        String mid = str.substring(1, str.length()-1);
        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }
    public String front3(String str) {
        String front;

        if (str.length() >= 3) {
            front = str.substring(0, 3);
        }
        else {
            front = str;
        }

        return front + front + front;
    }
    public String backAround(String str) {
        String last = str.substring(str.length()-1, str.length());
        return last + str + last;
    }
    public boolean or35(int n) {
        if(n % 5 == 0 || n % 3 == 0){
            return true;
        }
        return false;
    }
    public String front22(String str) {
        if(str.length() > 2) {
            String first = str.substring(0, 2);
            return first + str + first;
        }
        return str + str + str;
    }
    public boolean startHi(String str) {
        if(str.startsWith("hi")){
            return true;
        }
        return false;
    }
    public boolean icyHot(int temp1, int temp2) {
        if (temp1 < 0 && temp2 > 100 || temp1 > 100 && temp2 < 0){
            return true;
        }
        return false;
    }
    public boolean in1020(int a, int b) {
        if (a >= 10 && a <= 20 || b >= 10 && b <= 20){
            return true;
        }else {
            return false;
        }
    }
    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) ||
                (b>=13 && b<=19) ||
                (c>=13 && c<=19);
    }
    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }
    public String delDel(String str) {
        if(str.startsWith("del", 1)){
            return str.substring(0, 1) + str.substring(4, str.length());
        }else {
            return str;
        }
    }
    public boolean mixStart(String str) {
        if(str.startsWith("ix", 1)){
            return true;
        }else {
            return false;
        }
    }
    public String startOz(String str) {
        if(str.startsWith("oz")){
            return "oz";
        }else if(str.startsWith("z", 1)){
            return "z";
        }else if (str.startsWith("o")) {
            return "o";
        }return "";
    }
    public int intMax(int a, int b, int c) {
        if (a > b && a > c){
            return a;
        } else if (b >a && b > c) {
            return b;
        } else {
            return c;
        }
    }
    public int close10(int a, int b) {
        int num1 = 10 - a;
        int num2 = 10 - b;
        if(Math.abs(num1) < Math.abs(num2)){
            return a;
        } else if (Math.abs(num2) < Math.abs(num1)) {
            return b;
        }else {
            return 0;
        }
    }
    public boolean in3050(int a, int b) {
        if(a >= 30 && a <= 40 && b >=30 && b <= 40 || a >= 40 && a <= 50 && b >=40 && b <= 50){
            return true;
        }else {
            return false;
        }
    }
    public int max1020(int a, int b) {
        if (a >= 10 && a <=20 && b >= 10 && b <= 20){
            if(a > b){
                return a;
            }else {
                return b;
            }
        }else if(a >= 10 && a <=20){
            return a;
        }else if(b >= 10 && b <= 20){
            return b;
        }else {
            return 0;
        }
    }
    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i ++ ) {
            if (str.charAt(i) == 'e') {
                count ++;
            }
        }
        return count >= 1 && count <= 3;
    }
    public boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }
}
