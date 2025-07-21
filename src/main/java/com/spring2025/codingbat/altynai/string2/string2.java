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

}
