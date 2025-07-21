package com.spring2025.codingbat.altynai.string2;

public class string2 {
    public static void main(String[] args) {

    }
    //Given a string, return a string where for every char in the original, there are two chars.
    //
    //
    //doubleChar("The") → "TThhee"
    //doubleChar("AAbb") → "AAAAbbbb"
    //doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String str) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            sb.append(ch).append(ch);
        }
        return sb.toString();

    }

    //Return the number of times that the string "hi" appears anywhere in the given string.
    //
    //
    //countHi("abc hi ho") → 1
    //countHi("ABChi hi") → 2
    //countHi("hihi") → 2

    public int countHi(String str) {
        int count=0;
        for(int i=0; i<str.length()-1;i++){
            String s=str.substring(i, i+2);
            if(s.equals("hi")){

                count++;
            }
        }
        return count;
    }

    //Return true if the string "cat" and "dog" appear the same number of times in the given string.
    //
    //
    //catDog("catdog") → true
    //catDog("catcat") → false
    //catDog("1cat1cadodog") → true

    public boolean catDog(String str) {
        int catCount=0;
        int dogCount=0;
        for(int i=0; i<str.length()-2;i++){
            String s=str.substring(i, i+3);
            if(s.equals("cat")){
                catCount++;
            }
            if(s.equals("dog")){
                dogCount++;
            }
        }
        return catCount==dogCount;

    }

    //Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
    //
    //
    //countCode("aaacodebbb") → 1
    //countCode("codexxcode") → 2
    //countCode("cozexxcope") → 2

    public int countCode(String str) {
        int count=0;
        for(int i=0; i<str.length()-3;i++){
            String s=str.substring(i, i+4);
            if(s.charAt(0)=='c' && s.charAt(1)=='o' && s.charAt(3)=='e'){
                count++;
            }
        }
        return count;

    }

    //Given two strings, return true if either of the strings appears at the very end of the other string, ignoring upper/lower case differences (in other words, the computation should not be "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
    //
    //
    //endOther("Hiabc", "abc") → true
    //endOther("AbC", "HiaBc") → true
    //endOther("abc", "abXabc") → true

    public boolean endOther(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.endsWith(b) || b.endsWith(a)){
            return true;
        }else{
            return false;
        }
    }

    //Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
    //
    //
    //xyzThere("abcxyz") → true
    //xyzThere("abc.xyz") → false
    //xyzThere("xyz.abc") → true

    public boolean xyzThere(String str) {
        for(int i=0; i<str.length()-2; i++){
            String s=str.substring(i, i+3);
            if(s.equals("xyz")){
                if(i==0 || str.charAt(i-1) != '.'){
                    return true;
                }
            }
        }
        return false;
    }
}
