package com.spring2025.codingbat.talgat.warmup1;

public class Warmup1 {
    public static void main(String[] args) {

    }

    // W1 sleepIn
    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    // w2 monkeyTrouble
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    //w2 sumDouble
    public int sumDouble(int a, int b) {
        return (a == b) ? (a + b)*2 : a + b;
    }

    //w2 diff21
    public int diff21(int n) {
        return (n > 21) ? (n - 21) * 2: 21 - n;
    }

    //w2 parrotTrouble
    public boolean parrotTrouble(boolean talking, int hour) {

        if (hour <= 23 && hour >= 0){
            return talking && (hour < 7 || hour > 20);
        }else {
            return false;
        }

    }

    //w2 makes10
    public boolean makes10(int a, int b) {

        return (a == 10 || b == 10) || a + b == 10;
    }

    //w2 nearHundred
    public boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public boolean posNeg(int a, int b, boolean negative) {
        return negative ? (a < 0 && b < 0) : (a < 0 && b > 0) || (a > 0 && b < 0);
    }

    public String notString(String str) {
        String n = "not ";
        if (str.length() >= 3){
            if(str.substring(0,3).equals("not")){
                return str;
            }else {
                return n.concat(str);
            }
        }else {
            return n.concat(str);
        }
    }

    public String missingChar(String str, int n) {
        StringBuilder t = new StringBuilder(str);
        String result = t.deleteCharAt(n).toString();
        return result;
    }

    public String frontBack(String str) {

        if (str == null || str.length() <= 1) {
            return str;
        }

        char fch = str.charAt(0);
        char lch = str.charAt(str.length() - 1);
        String mid = str.substring(1, str.length() - 1);

        return lch + mid + fch;

    }

    public String front3(String str) {
        return (str.length()>3) ? str.substring(0,3)+str.substring(0,3)+str.substring(0,3):str + str + str;
    }

    public String backAround(String str) {
        return (str.length() >= 1) ? str.charAt(str.length()-1)+str+str.charAt(str.length()-1):str;
    }

    public boolean or35(int n) {
        return n%3==0||n%5==0;
    }

    public String front22(String str) {
        return (str.length() > 2 ) ? str.substring(0,2)+str+str.substring(0,2):str+str+str;
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");

    }

    public boolean icyHot(int temp1, int temp2) {
        return ((temp1<0&&temp2>100)||(temp1>100&&temp2<0))?true:false;
    }

    public boolean in1020(int a, int b) {
        return (a>=10&&a<=20)||(b>=10&&b<=20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return a>=13&&a<=19||b>=13&&b<=19||c>=13&&c<=19;
    }

    public boolean loneTeen(int a, int b) {
        return ((a>=13&&a<=19)!=(b>=13&&b<=19));
    }

    public String delDel(String str) {
        return (str.length()>=4 && str.substring(1,4).equals("del"))?str.substring(0,1)+str.substring(4):str;
    }

    public boolean mixStart(String str) {
        return str.length()>=3 && str.startsWith("ix",1);
    }

    public String startOz(String str) {
        String result = "";
        if (str.startsWith("o")||str.startsWith("z",1)){
            if (str.startsWith("oz")){
                result = "oz";
            } else if (str.startsWith("o")) {
                result = "o";
            } else{
                result = "z";
            }
        }
        return result;
    }

    public int intMax(int a, int b, int c) {
        int max = a;
        if (b>max&&b>c){
            max = b;
        }else if(c>max){
            max = c;
        }
        return max;
    }

    public int close10(int a, int b) {
        int intA = Math.abs(10 - a);
        int intB = Math.abs(10 - b);
        int result;
        if(intA!=intB){
            if(intA<intB){
                result = a;
            }else{
                result = b;
            }
        }else{
            result = 0;
        }
        return result;
    }

    public boolean in3050(int a, int b) {
        return (((a>=30&&a<=40)&&(b>=30&&b<=40))||((a>=40&&a<=50)&&(b>=40&&b<=50)));
    }

    public int max1020(int a, int b) {
        int result;
        if((a>=10&&a<=20)&&(b>=10&&b<=20)){
            if(a>b){
                result = a;
            }else {
                result = b;
            }
        }else if((a>=10&&a<=20)||(b>=10&&b<=20)){
            if (a>=10&&a<=20){
                result = a;
            }else{
                result = b;
            }
        }else {
            result = 0;
        }
        return result;
    }


    public boolean stringE(String str) {
        int count = 0;
        for (char ch: str.toCharArray()){
            if(ch == 'e'||ch == 'E'){
                count++;
            }
        }
        return count!=0&&count<=3;
    }

    public boolean lastDigit(int a, int b) {
        int A = a%10;
        int B = b%10;

        return A == B;
    }

    public String endUp(String str) {
        return (str.length()>3)? (str.substring(0,str.length()-3)) + (str.substring(str.length()-3).toUpperCase()):str.toUpperCase();
    }

    public String everyNth(String str, int n) {
        StringBuilder nCh = new StringBuilder();
        nCh.append(str.charAt(0));
        int countN = n;
        int count = 0;
        for (char ch: str.toCharArray()){
            if (count == countN && countN < str.length()){
                nCh.append(ch);
                countN += n;
            }
            count++;
        }
        return nCh.toString();
    }






}
