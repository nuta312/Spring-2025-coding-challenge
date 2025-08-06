package com.spring2025.codingbat.ayzada.warmup1;
/*
 @author Aizada
 */

public class Diff21 {
  /*Warmup-1 > diff21
prev  |  next  |  chance
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0

   */

    public int diff21(int n) {
        int res = Math.abs(n - 21);
        if (n > 21) {
            return res * 2;
        }
        return res;
    }
}

