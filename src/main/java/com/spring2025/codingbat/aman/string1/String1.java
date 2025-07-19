package com.spring2025.codingbat.aman.string1;

/**
 * @author Aman
 */
public class String1 {
    // 1.
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    // 2.
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
    // 3.
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }
    // 4.
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }

}
