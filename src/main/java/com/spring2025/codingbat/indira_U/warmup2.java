package com.spring2025.codingbat.indira_U;
/*
@author Indira
 */
public class warmup2 {
    /*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.

stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
    /*

Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        StringBuilder sb = new StringBuilder();
        String ftont = str.length() < 3? str : str.substring(0,3);
        for (int i = 0; i < n; i++) {
            sb.append(ftont);
        }
        return sb.toString();
    }
/*

Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
int countXX(String str) {
    int coun = 0;
    for (int i = 0; i < str.length()-1; i++) {
        if (str.substring(i, i + 2).equals("xx")) {
            coun++;
        }
    }
    return coun;
}
/*

Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
public String stringBits(String str) {
    String str2 = "";
    for (int i = 0; i < str.length() ; i+=2) {
        str2 += str.charAt(i);
    }
    return str2;
}

   /* Given a non-empty string like "Code" return a string like "CCoCodCode".


    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"*/
   public String stringSplosion(String str) {
       String result = "";
       for (int i = 1; i <= str.length(); i++) {
           result += str.substring(0,i);
       }
       return result;
   }

    /*Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2*/
    public int last2(String str) {
        int count = 0;

        if (str.length() > 2)  {

            String last = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                String sub = str.substring(i, i + 2);
                if (sub.equals(last)) {
                    count++;
                }
            }
        }
        return count;
    }
    /*

Given an array of ints, return the number of 9's in the array.

arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        int num9 = 9;
        for (int num : nums) {
            if (num == num9) {
                count++;
            }
        }
        return count;
    }
   /* Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false*/
   public boolean arrayFront9(int[] nums) {
       for (int i = 0; i < nums.length && i < 4; i++) {
           if (nums [i] == 9){
               return true;
           }
       }
       return false;
   }
}
