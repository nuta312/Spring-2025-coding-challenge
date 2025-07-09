package com.spring2025.codingbat.tim.string1;

public class String1 {
    public static void main(String[] args) {
        String1 s = new String1();
        System.out.println(s.helloName("Bob"));
        System.out.println(s.makeTags("<", "hi"));
        System.out.println(s.extraEnd("bicycle"));
        System.out.println(s.firstTwo("Collatheral"));
        System.out.println(s.withoutEnd("Kingsman"));
    }
    public String helloName(String name) {
        String hname = "Hello "+name+"!";
        return hname;
    }
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    public String extraEnd(String str) {
        String last2 = str.substring(str.length() - 2);
        return last2 + last2 +last2;
    }
    public String firstTwo(String str) {
        if(str.length()>1){

            return str.substring(0,2);}
        return str;
    }
    public String withoutEnd(String str) {
        return str.substring(1, str.length()-1);
    }

}
