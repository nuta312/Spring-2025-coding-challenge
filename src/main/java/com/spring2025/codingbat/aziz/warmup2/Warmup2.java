package com.spring2025.codingbat.aziz.warmup2;

public class Warmup2 {


    public String stringTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }


    public String frontTimes(String str, int n) {
        String front = "";
        String result = "";
        if(str.length()<3){
            front = str;
        }else {
            front = str.substring(0, 3);
        }
        for(int i = 0; i < n; i++){
            result += front;
        }
        return result;
    }



}
