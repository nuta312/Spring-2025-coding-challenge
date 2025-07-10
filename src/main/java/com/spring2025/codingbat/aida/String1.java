package com.spring2025.codingbat.aida;

public class String1 {

    /**
     * @Bershka
     */

    // Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    public String helloName(String name) {

        String hello = "Hello ";
        char symbol = '!';
        String result = hello.concat(name) + symbol;
        return result;
    }
}
