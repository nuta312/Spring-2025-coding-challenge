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


}
