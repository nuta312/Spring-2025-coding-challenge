package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _04_Diff21 {

/*
Дано целое число n. Верните абсолютную разницу между n и 21, но если n больше 21,
тогда верните удвоенную абсолютную разницу.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
    public int diff21(int n) {

        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

}
