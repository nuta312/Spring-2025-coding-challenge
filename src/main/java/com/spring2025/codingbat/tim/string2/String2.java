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
    public int countCode(String str) {
        int cc = 0;
        for(int i =0;i<str.length()-3;i++){
            if(str.substring(i,i+4).startsWith("co") && str.substring(i,i+4).endsWith("e"))cc++;

        }
        return cc;
    }
    public boolean endOther(String a, String b) {
        String aLow = a.toLowerCase();
        String bLow = b.toLowerCase();
        if(aLow.endsWith(bLow)) return true;
        if(bLow.endsWith(aLow)) return true;

        return false;
    }
    public boolean xyzThere(String str) {
        for(int i =0;i<str.length()-2; i++){
            if(str.substring(0,3).equals("xyz")) return true;
            if(str.substring(i,i+3).equals("xyz") && !str.substring(i-1,i).equals(".")) return true;
        }

        for(int i =0;i<str.length()-3; i++){
            if(str.substring(i,i+4).equals(".xyz")) return false;
        }

        return false;


    }
    public boolean bobThere(String str) {
        for(int i =0; i<str.length()-2;i++){
            if(str.substring(i,i+3).startsWith("b") && str.substring(i,i+3).endsWith("b")){
                return true;
            }
        }
        return false;
    }

}
