package com.spring2025.codingbat.zinaida.string2;
/*
@author Zinaida
 */
public class String2 {

    /*
Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result += ch;
            result += ch;
        }
        return result;
    }

    /*
Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") →
     */
    public int countHi(String str) {
        int count = 0;
        for (int i=0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("hi")){
                count += 1;
            }
        }

        return count;
    }

    /*
Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */
    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <= str.length()-3; i++){
            if (str.substring(i, i+3).equals("cat")){
                countCat += 1;
            }
            if(str.substring(i, i+3).equals("dog")){
                countDog += 1;
            }
        }
        if (countCat == countDog) return true;
        else return false;
    }

    /*
Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */
    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i <= str.length()-4; i++){
            if(str.substring(i, i+4).startsWith("co") && str.substring(i, i+4).endsWith("e")){
                count += 1;
            }
        }
        return count;
    }

    /*
Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
     */
    public boolean endOther(String a, String b) {
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();

        if (a1.endsWith(b1)) {
            return true;
        }

        if (b1.endsWith(a1)) {
            return true;
        } else return false;
    }


}
