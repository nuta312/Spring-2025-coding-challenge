package com.spring2025.codingbat.emil.string1;
    /*
    @author Emil
    */

public class String1 {

        /*
        Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
         */

        public String helloName(String name){
            String hello = "Hello ";
            char symbol = '!';
            String result = hello.concat(name) + symbol;
            return result;

    }

}
