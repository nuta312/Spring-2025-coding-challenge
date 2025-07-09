package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _03_SumDouble {

/*
Даны два целочисленных значения. Верните их сумму. Но если оба значения одинаковы,
тогда верните удвоенную сумму.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */
    public int sumDouble(int a, int b) {
        if (a == b) {
            return (a + b)* 2;
        } else {
            return a + b;
        }
    }
}
