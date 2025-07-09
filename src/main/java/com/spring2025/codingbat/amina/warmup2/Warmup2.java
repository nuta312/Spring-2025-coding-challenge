package com.spring2025.codingbat.amina.warmup2;
/**
 * @author Amina
 */
public class Warmup2 {
    /**
     Task 1 – stringTimes

     Given a string and a non-negative int n, return a larger string
     that is n copies of the original string.

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
     Task 2 – doubleX

     Given a string, return true if the first instance of "x"
     in the string is immediately followed by another "x".

     doubleX("axxbb") → true
     doubleX("axaxax") → false
     doubleX("xxxxx") → true
     */
    public boolean doubleX(String str) {
        int index = str.indexOf("x");
        return index != -1 && index + 1 < str.length() && str.charAt(index + 1) == 'x';
    }

    /**
     Task 3 – last2

     Given a string, return the count of the number of times that a substring of length 2
     appears in the string and also as the last 2 chars of the string.
     Do not count the last substring itself.

     last2("hixxhi") → 1
     last2("xaxxaxaxx") → 1
     last2("axxxaaxx") → 2
     */
    public int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(end)) {
                count++;
            }
        }
        return count;
    }

    /**
     Task 4 – array123

     Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

     array123([1, 1, 2, 3, 1]) → true
     array123([1, 1, 2, 4, 1]) → false
     array123([1, 1, 2, 1, 2, 3]) → true
     */
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true;
            }
        }
        return false;
    }

    /**
     Task 5 – altPairs

     Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ...

     altPairs("kitten") → "kien"
     altPairs("Chocolate") → "Chole"
     altPairs("CodingHorror") → "Congrr"
     */
    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            int end = Math.min(i + 2, str.length());
            result += str.substring(i, end);
        }
        return result;
    }

    /**
     Task 6 – noTriples

     Given an array of ints, return true if the array does not contain any triples.
     A triple is a value appearing 3 times in a row.

     noTriples([1, 1, 2, 2, 1]) → true
     noTriples([1, 1, 2, 2, 2, 1]) → false
     noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */
    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    /**
     Task 7 – frontTimes

     Given a string and a non-negative int n,
     return n copies of the front (first 3 chars or whole string if shorter).

     frontTimes("Chocolate", 2) → "ChoCho"
     frontTimes("Chocolate", 3) → "ChoChoCho"
     frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

    /**
     Task 8 – stringBits

     Given a string, return a new string made of every other char starting with the first.

     stringBits("Hello") → "Hlo"
     stringBits("Hi") → "H"
     stringBits("Heeololeo") → "Hello"
     */
    public String stringBits(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }

    /**
     Task 9 – arrayCount9

     Given an array of ints, return the number of 9's in the array.

     arrayCount9([1, 2, 9]) → 1
     arrayCount9([1, 9, 9]) → 2
     arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) count++;
        }
        return count;
    }

    /**
     Task 10 – stringMatch

     Given 2 strings, return the number of positions where they contain the same length 2 substring.

     stringMatch("xxcaazz", "xxbaaz") → 3
     stringMatch("abc", "abc") → 2
     stringMatch("abc", "axc") → 0
     */
    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    /**
     Task 11 – stringYak

     Given a string, return a version where all the "yak" are removed,
     but the 'a' can be any char. The "yak" strings will not overlap.

     stringYak("yakpak") → "pak"
     stringYak("pakyak") → "pak"
     stringYak("yak123ya") → "123ya"
     */
    public String stringYak(String str) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 3;
            } else {
                result += str.charAt(i);
                i++;
            }
        }

        return result;
    }

    /**
     Task 12 – countXX

     Count the number of "xx" in the given string. Overlapping is allowed,
     so "xxx" contains 2 "xx".

     countXX("abcxx") → 1
     countXX("xxx") → 2
     countXX("xxxx") → 3
     */
    public int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    /**
     Task 13 – stringSplosion

     Given a non-empty string like "Code" return a string like "CCoCodCode".

     stringSplosion("Code") → "CCoCodCode"
     stringSplosion("abc") → "aababc"
     stringSplosion("ab") → "aab"
     */
    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i <= str.length(); i++) {
            result += str.substring(0, i);
        }
        return result;
    }

    /**
     Task 14 – arrayFront9

     Given an array of ints, return true if one of the first 4 elements is a 9.
     The array length may be less than 4.

     arrayFront9([1, 2, 9, 3, 4]) → true
     arrayFront9([1, 2, 3, 4, 9]) → false
     arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public boolean arrayFront9(int[] nums) {
        int end = Math.min(nums.length, 4);
        for (int i = 0; i < end; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    /**
     Task 15 – stringX

     Given a string, return a version where all the "x" have been removed,
     except an "x" at the very start or end should not be removed.

     stringX("xxHxix") → "xHix"
     stringX("abxxxcd") → "abcd"
     stringX("xabxxxcdx") → "xabcdx"
     */
    public String stringX(String str) {
        if (str.length() <= 2) return str;

        String middle = str.substring(1, str.length() - 1).replace("x", "");
        return str.charAt(0) + middle + str.charAt(str.length() - 1);
    }

    /**
     Task 16 – array667

     Given an array of ints, return the number of times that two 6's are next to each other.
     Also count instances where the second "6" is actually a 7.

     array667([6, 6, 2]) → 1
     array667([6, 6, 2, 6]) → 1
     array667([6, 7, 2, 6]) → 1
     */
    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }

    /**
     Task 17 – has271

     Given an array of ints, return true if it contains a 2, 7, 1 pattern:
     a value, followed by the value + 5, followed by the value - 1.
     The last number can be off by at most 2.

     has271([1, 2, 7, 1]) → true
     has271([1, 2, 8, 1]) → false
     has271([2, 7, 1]) → true
     */
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == val + 5 &&
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }
}
