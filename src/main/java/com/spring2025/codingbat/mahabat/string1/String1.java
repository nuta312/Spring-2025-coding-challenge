package com.spring2025.codingbat.mahabat.string1;

public class String1 {
    // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    public String helloName(String name) {

        String hello = "Hello ";
        return hello.concat(name).concat("!");
    }

    /*Given two strings, a and b, return the result of putting them
    together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".*/

    public String makeAbba(String a, String b) {
        return a + b + b +a;
    }


}
