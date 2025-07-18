package com.spring2025.codingbat.zinaida.warmup1;
/*
@author Zinaida
 */
public class _13_BackAround {
/*
Given a string, take the last char and return a new string with the last char
added at the front and back, so "cat" yields "tcatt". The original string will be
length 1 or more.

backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
    public String backAround(String str) {

        String last = str.substring(str.length() - 1);
        return last + str + last;
    }

}
