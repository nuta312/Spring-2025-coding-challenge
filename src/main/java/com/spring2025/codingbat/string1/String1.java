package com.spring2025.codingbat.string1;

public class String1 {
    public static void main(String[] args) {

    }

    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2).concat(word).concat(out.substring(2, 4));
    }

    public String extraEnd(String str) {
        String last = str.substring(str.length() - 2);
        return last + last + last;
    }

    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2);
        } else {
            return str;
        }
    }

    public String firstHalf(String str) {
        int mid = str.length() / 2;
        return str.substring(0, mid);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (b.length() <= 2 && a.length() >= 2) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }

    public String left2(String str) {
        String first = str.substring(0, 2);
        String two = str.substring(2);
        return two + first;
    }

    public String right2(String str) {
        int len = str.length();
        String lastTwo = str.substring(len - 2);
        String beginning = str.substring(0, len - 2);
        return lastTwo + beginning;
    }

    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    public String withouEnd2(String str) {
        if (str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }



}