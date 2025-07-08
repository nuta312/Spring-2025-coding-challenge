package com.spring2025.codingbat.aidai.warmup2;

public class Warmup2 {
    /**
     * @author Aidai
     */
    /**
     Given a string and a non-negative int n, return a larger string that is n copies of the original string.


     stringTimes("Hi", 2) → "HiHi"
     stringTimes("Hi", 3) → "HiHiHi"
     stringTimes("Hi", 1) → "Hi"
     */
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str;
        }
        return result;
    }
/**
 Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;


 frontTimes("Chocolate", 2) → "ChoCho"
 frontTimes("Chocolate", 3) → "ChoChoCho"
 frontTimes("Abc", 3) → "AbcAbcAbc"
 */
public String frontTimes(String str, int n) {
    String front = str.length() < 3 ? str : str.substring(0, 3);
    String res = "";
    for (int i = 0; i < n; i++) {
        res += front;
    }
    return res;
}
/**
 Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


 countXX("abcxx") → 1
 countXX("xxx") → 2
 countXX("xxxx") → 3
 */
int countXX(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
            count++;

        }
    }
    return count;
}
/**
 Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


 doubleX("axxbb") → true
 doubleX("axaxax") → false
 doubleX("xxxxx") → true
 */
boolean doubleX(String str) {
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.charAt(i) == 'x') {
            if (str.charAt(i + 1) == 'x') {
                return true;
            }else{
                return false;
            }
        }
    }
    return false;
}
/**
 Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


 stringBits("Hello") → "Hlo"
 stringBits("Hi") → "H"
 stringBits("Heeololeo") → "Hello"
 */
public String stringBits(String str) {
    String res = "";
    for (int i = 0; i < str.length() ; i+=2) {
        char c = str.charAt (i);
        String s3 = String.valueOf(c);
        res += s3;
    }
    return res;
}
/**
 Given a non-empty string like "Code" return a string like "CCoCodCode".


 stringSplosion("Code") → "CCoCodCode"
 stringSplosion("abc") → "aababc"
 stringSplosion("ab") → "aab"
 */
public String stringSplosion(String str){
    String res = "";
    for (int i = 1; i <= str.length(); i++) {
        String part = str.substring(0, i);
        res += part;
    }
    return res;
}
/**
 Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


 last2("hixxhi") → 1
 last2("xaxxaxaxx") → 1
 last2("axxxaaxx") → 2
 */
public int last2(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 2; i++) {
        String last2 = str.substring(str.length() - 2);
        String part = str.substring(i, i+ 2);
        if (part.equals(last2)) {
            count++;
        }
    }
    return count;
}
/**
 Given an array of ints, return the number of 9's in the array.


 arrayCount9([1, 2, 9]) → 1
 arrayCount9([1, 9, 9]) → 2
 arrayCount9([1, 9, 9, 3, 9]) → 3
 */
public int arrayCount9(int[] nums) {
    int count = 0;
    for (int num : nums) {
        if (num == 9) {
            count++;
        }
    }
    return count;
}
/**
 Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.


 arrayFront9([1, 2, 9, 3, 4]) → true
 arrayFront9([1, 2, 3, 4, 9]) → false
 arrayFront9([1, 2, 3, 4, 5]) → false
 */
public boolean arrayFront9(int[] nums) {
    for (int i = 0; i < Math.min(4,nums.length); i++) {
        if(nums[i] == 9){
            return true;
        }
    }
    return false;
}
/**
 Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


 array123([1, 1, 2, 3, 1]) → true
 array123([1, 1, 2, 4, 1]) → false
 array123([1, 1, 2, 1, 2, 3]) → true
 */
public boolean array123(int[] nums) {
    for(int i =0;i < nums.length-2; i++){
        if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
            return true;
    }
    return false;
}
/**
 Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


 stringMatch("xxcaazz", "xxbaaz") → 3
 stringMatch("abc", "abc") → 2
 stringMatch("abc", "axc") → 0
 */
public int stringMatch(String a, String b) {
    int len = Math.min(a.length(),b.length());
    int count =0;
    for (int i = 0; i < len -1; i++) {
        String aSub = a.substring(i, i+ 2);
        String bSub = b.substring(i, i+ 2);
        if (aSub.equals(bSub)){
            count ++;
        }
    }
    return count;
}
}
