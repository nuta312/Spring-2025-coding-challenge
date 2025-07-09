package com.spring2025.codingbat.aliia.logic2;

/**
 * @author aliyaalymbekova
 */

public class Logic2 {

    /*
    We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
     */

    public boolean makeBricks(int small, int big, int goal) {
        int kolBig = goal / 5;
        int ostatok = goal % 5;
        int s = (small * 1) + (big * 5);
        if( s < goal) {
            return false;
        } else {
            if (kolBig == big || ostatok <= small) {
                return  true;
            } else {
                return  false;
            }
        }
    }

    /*
    Given 3 int values, a b c, return their sum.
    However, if one of the values is the same as another of the values, it does not count towards the sum.
     */

    public int loneSum(int a, int b, int c) {
        boolean s  = a == b ;
        boolean s1 = c == b ;
        boolean s2 = a == c ;


        if (s && s1 && s2) {
            return 0;
        } else if (s) {
            return c;
        } else if (s1) {
            return a;
        } else if (s2) {
            return b;
        } else {
            return a + b + c;
        }
    }

    /*
    Given 3 int values, a b c, return their sum. However,
    if one of the values is 13 then it does not count towards the sum and values to its right do not count.
    So for example, if b is 13, then both b and c do not count.
    */

    public int luckySum(int a, int b, int c) {
        if (a == 13) {
            return 0;
        } else if (b == 13 && c == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else if (b == 13){
            return a;
        } else {
            return  a + b + c;
        }
    }

    /*
    Given 3 int values, a b c, return their sum.
     However, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0,
     except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n)
     {"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times (i.e. "decomposition").
     Define the helper below and at the same indent level as the main noTeenSum().
     */

    public int noTeenSum(int a, int b, int c) {
        if(a >= 13 && a <= 14 || a >= 17 && a <= 19) {
            a = 0;
        }
        if(b >= 13 && b <= 14 || b >= 17 && b <= 19) {
            b = 0;
        }
        if (c >= 13 && c <= 14 || c >= 17 && c <= 19) {
            c = 0;
        }
        return a + b + c;
    }

    /*
    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20.
    Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values.
    To avoid code repetition, write a separate helper "public int round10(int num) {" and call it 3 times.
    Write the helper entirely below and at the same indent level as roundSum().
     */

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if(num % 10 < 5) {
            return num - (num % 10);
        } else {
            return num + (10 - (num % 10));
        }
    }

    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other is "far",
    differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a number.
     */

    public boolean closeFar(int a, int b, int c) {
        if (Math.abs(a - b) <= 1 && Math.abs(a - c) >= 2 && Math.abs(b - c) >= 2){
            return true;
        } else if (Math.abs(a - c) <= 1 && Math.abs(a - b) >= 2 && Math.abs(b - c) >= 2){
            return true;
        }else{
            return false;
        }
    }

}
