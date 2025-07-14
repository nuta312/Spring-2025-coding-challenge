package com.spring2025.codingbat.alibek.warmup1;

/*
@author Alibek
 */
public class Warmup1 {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        } else {
            return false;
        }
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        } else if (!aSmile && !bSmile) {
            return true;
        } else {
            return false;
        }
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }return sum;
    }

    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10){
            return true;
        }else if (a + b == 10){
            return true;
        }else{
            return false;
        }
    }

    public boolean nearHundred(int n) {
        if((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10)){
            return true;
        }else{
            return false;
        }
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return ((a > 0 && b < 0 && !negative) || (b > 0 && a < 0 && !negative)
                || (a < 0 && b < 0 && negative)) ? true : false;}

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }return "not " + str;
    }

    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
        return front + back;
    }

    public String frontBack(String str) {
        String result = "";
        if (str.length() > 1){
            String a = str.substring(0,1);
            String b = str.substring(str.length()-1, str.length());
            String c = str.substring(1, str.length()-1);
            result = b + c + a;
        }else {
            result = str;
        }
        return result;
    }

    public String front3(String str) {
        String front;
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }return front + front + front;
    }

    public String backAround(String str) {
        String s = str.substring(str.length() - 1);
        return s + str + s;
    }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        int i = 2;
        if (i > str.length()) {
            i = str.length();
        }String s = str.substring(0, i);
        return s + str + s;
    }

    public boolean startHi(String str) {  return (str.startsWith("hi")) ? true : false;}


    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19) ? true : false;
    }

    public boolean loneTeen(int a, int b) {
        boolean a1 = (a >= 13 && a <= 19);
        boolean b1 = (b >= 13 && b <= 19);
        return (!a1 && b1) || (a1 && !b1) ? true : false;
    }

    public String delDel(String str) {
        if (str.length()>=4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }return str;
    }

    public boolean mixStart(String str) {
        if (str.startsWith("mix")){
            return true;
        }else if (str.endsWith(" ix") || str.startsWith("pix") || str.startsWith("9ix" ) || str.startsWith("nix")){
            return true;
        }else {
            return false;
        }
    }

    public String startOz(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0)=='o') {
            result = result + str.charAt(0);
        } if (str.length() >= 2 && str.charAt(1)=='z') {
            result = result + str.charAt(1);
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        int max = 0;
        if(a > b){
            max = a;
        }else {
            max = b ;
        }if(c > max){
            max = c;
        }return max;
    }

    public int close10(int a, int b) {
        int A = Math.abs(a - 10);
        int B = Math.abs(b - 10);
        if (A < B) {
            return a;
        } else if (B < A) {
            return b;
        } else {
            return 0;
        }
    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40){
            return true;
        }else if (a >= 40 && a <= 50 && b >= 40 && b <= 50){
            return true;
        }else {
            return false;
        }
    }

    public int max1020(int a, int b) {
        if (b > a) {
            int max = a;
            a = b;
            b = max;
        }if (a >= 10 && a <= 20) {
            return a;
        } else if (b >= 10 && b <= 20) {
            return b;
        } else {
            return 0;
        }
    }



}