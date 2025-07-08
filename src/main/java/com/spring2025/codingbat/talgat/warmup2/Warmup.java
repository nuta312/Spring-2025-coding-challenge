package com.spring2025.codingbat.talgat.warmup2;

public class Warmup {
    public static void main(String[] args) {

    }
    // 1
    public String stringTimes(String str, int n) {
        String strN = "";
        for(int i = 1;i<=n;i++){
            strN = strN+str;
        }
        return strN;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            if (str.length()>3){
                String test = str.substring(0,3);
                result+=test;
            }else {
                result+=str;
            }
        }
        return result;
    }

    int countXX(String str) {
        int result = 0;
        int count = 0;
        for (char ch: str.toCharArray()){
            if (Character.toString(ch).equalsIgnoreCase("x")){
                if ((str.length()-1) > count && str.substring(count, count + 2).equalsIgnoreCase("xx"))
                    result+=1;
            }
            count++;
        }
        return result;
    }

    public String stringBits(String str) {
        String result = "";
        int count = 0;
        for (char ch: str.toCharArray()){
            if (count%2==0){
                result+=ch;
            }
            count++;
        }
        return result;
    }


}
