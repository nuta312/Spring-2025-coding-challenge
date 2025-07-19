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
    // 5.
    public String extraEnd(String str) {
        return str.substring(str.length()-2) + str.substring(str.length()-2) + str.substring(str.length()-2);
    }
    // 6.
    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0,2);
    }
    // 7.
    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);

    }
    // 8.
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
    // 9.
    public String comboString(String a, String b) {
        String shorter = "";
        String longer = "";
        if (a.length() < b.length()){
            shorter = a;
            longer = b;
        } else {
            shorter = b;
            longer = a;
        }
        return shorter + longer + shorter;
    }
    // 10.
    public String nonStart(String a, String b) {
        if(a.length() < 1 && b.length() < 1) {
            return a;
        }
        return a.substring(1) + b.substring(1);
    }


}
