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

    //Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.
    //
    //
    //bobThere("abcbob") → true
    //bobThere("b9b") → true
    //bobThere("bac") → false

    public boolean bobThere(String str) {
        for(int i=0; i<str.length()-2;i++){

            if(str.charAt(i)=='b' && str.charAt(i+2)=='b'){
                return true;
            }
        }
        return false;
    }

    //We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
    //
    //
    //xyBalance("aaxbby") → true
    //xyBalance("aaxbb") → false
    //xyBalance("yaaxbb") → false

    public boolean xyBalance(String str) {
        boolean xUnbalanced=false;
        for(int i=0; i<str.length();i++){
            if(str.charAt(i)=='x'){
                xUnbalanced=true;
            }
            if(str.charAt(i)=='y'){
                xUnbalanced=false;
            }
        }
        return !xUnbalanced;
    }

    //Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
    //
    //
    //mixString("abc", "xyz") → "axbycz"
    //mixString("Hi", "There") → "HTihere"
    //mixString("xxxx", "There") → "xTxhxexre"

    public String mixString(String a, String b){
        String result="";
        int maxLen=Math.max(a.length(), b.length());
        for(int i=0; i<maxLen;i++){
            if(i<a.length()){
                result+=a.charAt(i);
            }
            if(i<b.length()){
                result+=b.charAt(i);
            }
        }
        return result;
    }

    //Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
    //
    //
    //repeatEnd("Hello", 3) → "llollollo"
    //repeatEnd("Hello", 2) → "lolo"
    //repeatEnd("Hello", 1) → "o"

    public String repeatEnd(String str, int n) {
        String result="";
        for(int i=0; i<n; i++){

            String s=str.substring(str.length()-n);
            result+=s;
        }
        return result;
    }

    //Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1 characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
    //
    //
    //repeatFront("Chocolate", 4) → "ChocChoChC"
    //repeatFront("Chocolate", 3) → "ChoChC"
    //repeatFront("Ice Cream", 2) → "IcI"

    public String repeatFront(String str, int n) {
        String result="";
        for(int i=n; i>=1;i--){
            String s=str.substring(0,i);
            result+=s;
        }

        return result;
    }
}
