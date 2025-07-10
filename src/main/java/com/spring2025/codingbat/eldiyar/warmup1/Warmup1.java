package com.spring2025.codingbat.eldiyar.warmup1;

public class Warmup1 {
    public static void main(String[] args) {
        /**
         * В этом классе все решения задач из CodingBat: Warmup-1
         * @author Eldiyar
         */
    }

    /**
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    /**
     * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
     * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
     * monkeyTrouble(true, true) → true
     * monkeyTrouble(false, false) → true
     * monkeyTrouble(true, false) → false
     */

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /**
     * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
     * sumDouble(1, 2) → 3
     * sumDouble(3, 2) → 5
     * sumDouble(2, 2) → 8
     */

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            sum = sum * 2;
        }
        return sum;
    }

    /**
     * Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     */
    public int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    /**
     * We have a loud talking parrot. The "hour" parameter is the current hour time in the
     * range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20.
     * Return true if we are in trouble.
     * parrotTrouble(true, 6) → true
     * parrotTrouble(true, 7) → false
     * parrotTrouble(false, 6) → false
     */

    public boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

    public boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public boolean nearHundred(int n) {
        return Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    public String notString(String str) {
        String str1 = "not ";
        return str.startsWith("not") ? str : str1 + str;
    }

    public String missingChar(String str, int n) {
        StringBuilder sb1 = new StringBuilder(str);
        return sb1.delete(n, n + 1).toString();
    }

    public String frontBack(String str) {
        if (str.length() > 1) {
            return str.substring(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
        }
        return str;
    }

    public String front3(String str) {
        if (str.length() < 3) return str + str + str;
        String word = str.substring(0, 3);
        return word + word + word;
    }

    public String backAround(String str) {
        String str1 = str.substring(str.length() - 1);
        return str1 + str + str1;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2).concat(str).concat(str.substring(0, 2));
        }
    }

    public boolean startHi(String str) {
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public boolean hasTeen(int a, int b, int c) {
        return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);
        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.startsWith("del", 1)) {
            return str.charAt(0) + str.substring(4);
        } else {
            return str;
        }
    }

    public boolean mixStart(String str) {
        return str.length() >= 3 && str.startsWith("ix", 1);
    }

    public String startOz(String str) {
        String ss = "";
        if (!str.isEmpty() && str.charAt(0) == 'o') {
            ss += "o";
        }
        if (str.length() >= 2 && str.charAt(1) == 'z') {
            ss += "z";
        }
        return ss;
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

    public int close10(int a, int b) {
        int aNum = Math.abs(a - 10);
        int bNum = Math.abs(b - 10);

        if (aNum < bNum) return a;
        if (bNum < aNum) return b;
        return 0;
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) ||
                ((a >= 40 && a <= 50) && (b >= 40 && b <= 50));
    }

    public int max1020(int a, int b) {
        if (a < 10 || a > 20) {
            a = 0;
        }
        if (b < 10 || b > 20) {
            b = 0;
        }
        return Math.max(a, b);
    }

    public boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e')
                count++;
        }
        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public String endUp(String str) {
        if (str.length() <= 3) return str.toUpperCase();

        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);
        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i = i + n) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}