package com.spring2025.codingbat.kunduz1.string1;

public class String1 {
    public static void main(String[] args) {

    }

//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
//
//
//helloName("Bob") → "Hello Bob!"
//helloName("Alice") → "Hello Alice!"
//helloName("X") → "Hello X!"


    public String helloName(String name) {
        String hello = "Hello ";
        char symbol = '!';
        String result = hello.concat(name) + (symbol);
        return result;
    }
}