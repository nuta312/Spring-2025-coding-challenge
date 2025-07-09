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
    public boolean xyBalance(String str) {
        int ix = str.lastIndexOf("x");
        int iy = str.lastIndexOf("y");
        if(iy-ix >0){
            return true;
        }
        if(iy-ix <0){
            return false;
        }
        return true;
    }
    public String mixString(String a, String b) {
        String result = "";
        int maxLen = Math.max(a.length(), b.length());
        for(int i=0;i<maxLen;i++){
            if(i<a.length()){
                result+=a.charAt(i);
            }
            if(i<b.length()){
                result+=b.charAt(i);
            }
        }




        return result;
    }
    public String repeatEnd(String str, int n) {
        String result = "";
        String end = str.substring(str.length()-n);
        for(int i=0;i<n;i++){
            result +=end;
        }
        return result;
    }
    public String repeatFront(String str, int n) {

        String result = "";
        int temp = n;

        for(int i = 0;i<=n;i++){
            String let = str.substring(0,temp);
            result+=let;
            temp--;
        }
        return result;
    }
    public String repeatSeparator(String word, String sep, int count) {
        String result ="";
        for(int i=0;i<count;i++){

            result += word;
            if(i<count-1){
                result+=sep;
            }
        }
        return result;
    }
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n);
//for(int i =0;i<str.length()-n;i++){
        if(str.substring(n).contains(prefix)){
            return true;
        }

        return false;

    }
    public boolean xyzMiddle(String str) {
        int half = str.length()/2;
        int index = str.indexOf("xyz");
        if(index == half || index == half -1 || index == half +1 || index == half -2
                || index == half +2){
            return true;
        }
        return false;
    }
    public String getSandwich(String str) {
        String result= "";
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");
        if(first == last) return "";
        if(str.length()<5 || first+5 > str.length() || last +5>str.length() || !str.contains("bread")) return "";
        String sfirst = str.substring(first, first+5);
        String slast = str.substring(last, last+5);

        if(str.contains(sfirst) && str.contains(slast)){
            result = str.substring(first+5, last);

        } else{
            return "";
        }


        return result;
    }
}
