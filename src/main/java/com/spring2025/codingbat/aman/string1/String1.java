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
    // 11.
    public String left2(String str) {
        String s1 = str.substring(0,2);
        String s2 = str.substring(2);
        return s2 + s1;
    }
    // 12.
    public String right2(String str) {
        if(str.length() <= 2){
            return str;
        }
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }
    // 13.
    public String theEnd(String str, boolean front) {
        if(front){
            return str.substring(0,1);
        }
        return str.substring(str.length()-1);
    }
    // 14.
    public String withouEnd2(String str) {
        if(str.length() <= 1) {
            return "";
        }
        return str.substring(1,str.length()-1);
    }
    // 15.
    public String middleTwo(String str) {
        String midleft = str.substring(str.length()/2 - 1, str.length()/2);
        String midright = str.substring(str.length()/2,str.length()/2+1);
        return midleft+midright;
    }
    // 16.
    public boolean endsLy(String str) {
        return str.endsWith("ly");
    }
    // 17.
    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }
    // 18.
    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length()){
            return str.substring(0,2);
        }
        return str.substring(index, index + 2);
    }
    // 19.
    public String middleThree(String str) {
        if(str.length() < 3) {
            return str;
        } else if(str.length() % 2 != 0){
            return str.substring(str.length() / 2 - 1, str.length() / 2 + 2);
        }
        return "";
    }
    // 20.
    public boolean hasBad(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("bad")) {
            return true;
        }
        if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }

}
