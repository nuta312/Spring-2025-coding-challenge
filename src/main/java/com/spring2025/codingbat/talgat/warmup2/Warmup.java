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


}
