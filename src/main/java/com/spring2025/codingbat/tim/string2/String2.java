package com.spring2025.codingbat.tim.string2;

public class String2 {
    public static void main(String[] args) {
        String2 s = new String2();
        System.out.println(s.doubleChar("Hello"));
        System.out.println(s.countHi("hilarious"));
    }
    public String doubleChar(String str) {
        String loop = "";
        for(int i = 0; i<str.length(); i++){
            loop = loop + str.charAt(i) + str.charAt(i);
            //loop += str.charAt(i);
        }
        return loop.toString();
    }
    public int countHi(String str) {
        int count = 0;
        for(int i = 0; i<str.length()-1;i++){
            if(str.substring(i,i+2).equals("hi")){
                count +=1;
            }

        }
        return count;
    }
    public boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for(int i =0; i<str.length()-2;i++){
            if(str.substring(i,i+3).equals("cat")) catCount++;
            if(str.substring(i,i+3).equals("dog")) dogCount++;
        }
        return (catCount == dogCount);
    }
}
