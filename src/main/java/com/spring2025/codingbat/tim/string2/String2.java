package com.spring2025.codingbat.tim.string2;

public class String2 {
    public static void main(String[] args) {
        String2 s = new String2();
        System.out.println(s.doubleChar("Hello"));
    }
    public String doubleChar(String str) {
        String loop = "";
        for(int i = 0; i<str.length(); i++){
            loop = loop + str.charAt(i) + str.charAt(i);
            //loop += str.charAt(i);
        }
        return loop.toString();
    }
}
