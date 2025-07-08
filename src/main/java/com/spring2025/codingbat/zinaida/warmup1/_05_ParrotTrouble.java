package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _05_ParrotTrouble {
/*
У нас есть попугай, который громко разговаривает. Параметр "hour" — это текущий
час в диапазоне от 0 до 23. Мы в беде, если попугай разговаривает и время
раньше 7 часов утра или позже 20 часов вечера. Верните true, если мы в беде.

parrotTrouble(true, 6) → true
parrotTrouble(true, 7) → false
parrotTrouble(false, 6) → false

 */
    public boolean parrotTrouble(boolean talking, int hour) {

        return (talking && (hour < 7 || hour > 20));

    }
}
