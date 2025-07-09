package com.spring2025.codingbat.madina.string1;

public class String1 {
    public static void main(String[] args) {
    }

  /**  Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
    helloName("Bob") → "Hello Bob!"
    helloName("Alice") → "Hello Alice!"
    helloName("X") → "Hello X!"
   */
  public String helloName(String name) {
      String hello = "Hello " + name + "!";
      return hello;
  }
    /** Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
    makeAbba("Hi", "Bye") → "HiByeByeHi"
    makeAbba("Yo", "Alice") → "YoAliceAliceYo"
    makeAbba("What", "Up") → "WhatUpUpWhat"
     */
    public String makeAbba(String a, String b) {
        String s1 = a+b ;
        String s2=b+a;
        return s1+s2;
    }
    /**The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
    makeTags("i", "Yay") → "<i>Yay</i>"
    makeTags("i", "Hello") → "<i>Hello</i>"
    makeTags("cite", "Yay") → "<cite>Yay</cite>"
     */
    public String makeTags(String tag, String word) {
        String t="<"+tag+ ">"+word+"</"+tag+">";
        return t;
    }
   /* Given an "out" string length 4, such as "<<>>",
    and a word, return a new string where the word is in
    the middle of the out string, e.g. "<<word>>".
    Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
     makeOutWord("<<>>", "Yay") → "<<Yay>>"
    makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
    makeOutWord("[[]]", "word") → "[[word]]"*/
   public String makeOutWord(String out, String word) {
       String left =out.substring(0,out.length()/2);
       String right =out.substring(out.length()/2);
       return left+word+right;
   }
   /* Given a string, return a new string made
   of 3 copies of the last 2 chars of the original string.
   The string length will be at least 2.
    extraEnd("Hello") → "lololo"
    extraEnd("ab") → "ababab"
    extraEnd("Hi") → "HiHiHi"
    */
   public String extraEnd(String str) {
       String last2 =str.substring(str.length()-2);
       return last2+last2+last2;
   }
    /**Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
     firstHalf("WooHoo") → "Woo"
    firstHalf("HelloThere") → "Hello"
    firstHalf("abcdef") → "abc"
     */
    public  String firstHalf(String str) {
        int half =str.length()/2;
        return str.substring(0,half);
    }
    /*Given a string, return a version without the first
    and last char, so "Hello" yields "ell". The string length will be at least 2.
     withoutEnd("Hello") → "ell"
    withoutEnd("java") → "av"
    withoutEnd("coding") → "odin"*/
    public String withoutEnd(String str) {
        if(str.length()>2){
        }
        return str.substring(1,str.length()-1);
    }
    /*Given 2 strings, a and b, return a string of the form
     short+long+short, with the shorter string on the outside and
      the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).
    comboString("Hello", "hi") → "hiHellohi"
    comboString("hi", "Hello") → "hiHellohi"
    comboString("aaa", "b") → "baaab"*/
    public String comboString(String a, String b) {
        if( a.length() > b.length() ){
            return b+a+b;
        } else {
            return a+b+a;
        }
    }
}
