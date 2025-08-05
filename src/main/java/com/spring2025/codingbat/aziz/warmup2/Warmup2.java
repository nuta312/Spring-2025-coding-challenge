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


    int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }


    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1){
            return false;
        }
        if (i + 1 >= str.length()){
            return false;
        }
        return str.substring(i+1, i+2).equals("x");
    }


    public String stringBits(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i +=2){
            result += str.charAt(i);
        }
        return result;
    }


    public String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i <= str.length(); i++){
            result +=  str.substring(0,i);
        }
        return result;
    }

}
