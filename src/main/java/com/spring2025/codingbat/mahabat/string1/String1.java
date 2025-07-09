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

    /* The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
    In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
    Given tag and word strings,create the HTML string with tags around the word, e.g. "<i>Yay</i>".*/

    public String makeTags(String tag, String word) {

        String wr = "<";
        String lf = ">";
        return wr + tag + lf + word + wr + "/" +tag + lf;
    }

    /* Given an "out" string length 4, such as "<<>>", and a word,
    return a new string where the word is in the middle of the out string, e.g. "<<word>>".
    Note: use str.substring(i, j) to extract the String starting at index i and going up to
    but not including index j.*/

    public String makeOutWord(String out, String word) {

        String result ="";
        if (out.length() == 4){
            result = out.substring(0,2).concat(word).concat(out.substring(2));
        }
        return result;
    }

    /*Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
    The string length will be at least 2.*/

    public String extraEnd(String str) {

        String result = "";
        if(str .length() >= 2){
            String two = str.substring(str.length()-2);
            result = two + two +two;
        }
        return result;
    }

    /* Given a string, return the string made of its first two chars,
    so the String "Hello" yields "He". If the string is shorter than length 2,
    return whatever there is, so "X" yields "X", and the empty string "" yields the empty
    string "". Note that str.length() returns the length of a string.*/

    public String firstTwo(String str) {

        if (str.length() < 2) return str;
        String word = str.substring(0,2);
        return word;
    }

    // Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

    public String firstHalf(String str) {
        return str.substring(0,str.length() / 2);
    }

    /* Given a string, return a version without the first and last char,
    so "Hello" yields "ell". The string length will be at least 2.*/

    public String withoutEnd(String str) {

        String result = "";
        if (str.length() >= 2 ){
            result = str.substring(1,str.length()-1);
        }
        return result;
    }

    /* Given 2 strings, a and b, return a string of the form short+long+short,
    with the shorter string on the outside and the longer string on the inside.
    The strings will not be the same length, but they may be empty (length 0).*/

    public String comboString(String a, String b) {

        if (a.length() < b.length()){
            return a + b + a;
        }else {
            return b + a + b;
        }
    }

    // Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

    public String nonStart(String a, String b) {

        return a.substring(1) + b.substring(1);
    }

    /* Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
    The string length will be at least 2.*/

    public String left2(String str) {

        if (str.length() < 3) return str;
        String two = str.substring(0,2);
        return str.substring(2).concat(two);
    }

    /* Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
    The string length will be at least 2.*/

    public String right2(String str) {

        String last = str.substring(str.length()-2);
        String rest = str.substring(0,str.length()-2);
        return last + rest;
    }

    /* Given a string, return a string length 1 from its front, unless front is false,
    in which case return a string length 1 from its back. The string will be non-empty.*/

    public String theEnd(String str, boolean front) {

        if (front){
            return str.substring(0,1);
        }else {
            return str.substring(str.length()-1);
        }
    }

    /* Given a string, return a version without both the first and last char of the string.
    The string may be any length, including 0.*/

    public String withouEnd2(String str) {

        if(str.length() <= 1) return "";
        return str.substring(1,str.length()-1);
    }

    /* Given a string of even length, return a string made of the middle two chars,
    so the string "string" yields "ri". The string length will be at least 2.*/

    public String middleTwo(String str) {

        int mid = str.length() / 2;
        return str.substring(mid -1,mid + 1);
    }

    // Given a string, return true if it ends in "ly".

    public boolean endsLy(String str) {

        return str.endsWith("ly") ? true : false;
    }

    /* Given a string and an int n, return a string made of the first and last n
    chars from the string. The string length will be at least n.*/

    public String nTwice(String str, int n) {

        String a = str.substring(0,n);
        String b = str.substring(str.length()-n);
        return a + b;
    }

    /* Given a string and an index, return a string length 2 starting at the given index.
     If the index is too big or too small to define a string length 2, use the first 2 chars.
      The string length will be at least 2.*/

    public String twoChar(String str, int index) {

        if(index < 0 || index +1 >= str.length()) return str.substring(0,2);
        return str.substring(index,index+2);
    }

    /* Given a string of odd length, return the string length 3 from its middle,
    so "Candy" yields "and". The string length will be at least 3.*/

    public String middleThree(String str) {

        String result = "";
        if (str.length() >= 3){
            int mid = str.length() / 2;
            result = str.substring(mid-1,mid +2);
        }
        return result;
    }

    /* Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
    such as with "badxxx" or "xbadxx" but not "xxbadxx".
    The string may be any length, including 0. Note: use .equals() to compare 2 strings.*/

    public boolean hasBad(String str) {

        return (str.length()>= 3 && str.startsWith("bad")||
                str.length() >= 4 && str.substring(1,4).equals("bad"));
    }

    /* Given a string, return a string length 2 made of its first 2 chars.
    If the string length is less than 2, use '@' for the missing chars.*/

    public String atFirst(String str) {

        if (str.length() >= 2 ) {
            return str.substring(0,2);
        }else if (str.length() == 1 ) {
            return str + "@";
        }else{
            return "@@";
        }
    }

    /* Given 2 strings, a and b, return a new string made of the first char of a and the l
    ast char of b, so "yo" and "java" yields "ya".
    If either string is length 0, use '@' for its missing char.*/

    public String lastChars(String a, String b) {

        String first = a.isEmpty() ? "@" : a.substring(0, 1);
        String last = b.isEmpty() ? "@" : b.substring(b.length() - 1);
        return first + last;
    }

    /* Given two strings, append them together (known as "concatenation") and return
    the result. However, if the concatenation creates a double-char,
    then omit one of the chars, so "abc" and "cat" yields "abcat".*/

    public String conCat(String a, String b) {

        if (a.isEmpty() || b.isEmpty()) return a + b;
        if(a.charAt(a.length()-1) == b.charAt(0)){
            return a.concat(b.substring(1));
        } else{
            return a.concat(b);
        }
    }

    /* Given a string of any length, return a new string where the last 2 chars,
    if present, are swapped, so "coding" yields "codign".*/

    public String lastTwo(String str) {

        if (str.length() <= 1) return str;
        String last = str.substring(str.length()-2);
        String newStr = new StringBuilder(last).reverse().toString();
        return str.substring(0,str.length()-2) + newStr;
    }

    /* Given a string, if the string begins with "red" or "blue" return that color string,
    otherwise return the empty string.*/

    public String seeColor(String str) {

        String newStr = "";
        if(str.startsWith("red")){
            newStr = "red";
        } else if (str.startsWith("blue")) {
            newStr = "blue";
        }else{
            newStr = "";
        }
        return  newStr;
    }


}
