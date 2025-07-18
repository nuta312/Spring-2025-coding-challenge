package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
*/
public class _29_Max1020 {
    /*
Given 2 positive int values, return the larger value that is in the range 10..20
inclusive, or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
     */

    public int max1020(int a, int b) {

        if (b > a) {
            int times = a;
            a = b;
            b = times;
        }

        if (a >= 10 && a <= 20) {
            return a;
        } else if(b >= 10 && b <= 20){
            return b;
        }return 0;
    }

}
