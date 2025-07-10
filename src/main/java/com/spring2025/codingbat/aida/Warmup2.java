package com.spring2025.codingbat.aida;

public class Warmup2 {

    /**
     * @Bershka
     */

    // Given a string and a non-negative int n, return a larger string that is n copies of the original string.

    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    // Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(front);
        }
        return result.toString();
    }

    // Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    // Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

    boolean doubleX(String str) {

        int index = str.indexOf("x");
        if (index == -1 || index + 1 >= str.length()) {
            return false;
        }
        return str.charAt(index + 1) == 'x';
    }

    // Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

    public String stringBits(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Given a non-empty string like "Code" return a string like "CCoCodCode".

    public String stringSplosion(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
            result.append(str.substring(0, i));
        }
        return result.toString();
    }

    /* Given a string, return the count of the number of times that a substring length
    2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).
     */

    public int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        String last2 = str.substring(str.length() - 2);
        int count = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(last2)) {
                count++;
            }
        }

        return count;
    }

    // Given an array of ints, return the number of 9's in the array.

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num == 9) {
                count++;
            }
        }
        return count;
    }

    // Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

    public boolean arrayFront9(int[] nums) {
        int len = Math.min(nums.length, 4);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }



}
