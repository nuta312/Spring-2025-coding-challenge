package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
*/
public class _25_Close10 {
/*
Given 2 int values, return whichever value is nearest to the
value 10, or return 0 in the event of a tie. Note that Math.abs(n)
returns the absolute value of a number.

close10(8, 13) → 8
close10(13, 8) → 8
 */
    public int close10(int a, int b) {

        int result = 0;
        if (Math.abs(10 - a) < Math.abs(10 - b)) {
            result = a;
        } else if (Math.abs(10 - b) < Math.abs(10 - a)) {
            result = b;
        } else if (Math.abs(10 - b) == Math.abs(10 - a)) {
            result = 0;
        }
        return result;
    }

}
