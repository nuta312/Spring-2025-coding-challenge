package com.spring2025.codingbat.kairat.warmup2;

/**
 * @author qairatman
 */
public class Warmup2 {

   /* Given a string and a non-negative int n,
    return a larger string that is n copies
    of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi" */

    public String stringTimes(String str, int n) {
        String str2 = "";
        for (int i = 0; i < n; i++) {
            str2 += str;
        }
        return str2;
    }

/*    Given a string and a non-negative int n,
    we'll say that the front of the string is the
    first 3 chars, or whatever is there if the string
    is less than length 3. Return n copies of the front;


    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"*/

    public String frontTimes(String str, int n) {
        if(str.length()<=3){
            String str2 = "";
            for(int i = 0;i<n;i++){
                str2+=str;
            }
            return str2;
        }else {
            String str1 = str.substring(0,3);
            String str2 = "";
            for(int i = 0;i<n;i++){
                str2+=str1;
            }
            return str2;
        }
    }


}
