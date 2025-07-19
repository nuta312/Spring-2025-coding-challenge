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
    // 21.
    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@@";
        }
    }
    // 22.
    public String lastChars(String a, String b) {
        String first = a.length() > 0 ? a.substring(0, 1) : "@";
        String last = b.length() > 0 ? b.substring(b.length() - 1) : "@";
        return first + last ;
    }
    // 23.
    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }
    // 24.
    public String lastTwo(String str) {
        if (str.length() < 2) return str;
        String mains = str.substring(0, str.length() - 2);
        String prelast = str.substring(str.length() - 2, str.length() - 1);
        String last = str.substring(str.length() - 1);
        return mains + last + prelast;
    }
    // 25.
    public String seeColor(String str) {
        if(str.startsWith("red")){
            return "red";
        } else if  (str.contains("blue")){
            return "blue";
        } else
            return "";
    }
    // 26.
    public boolean frontAgain(String str) {
        if(str.length() < 2){
            return false;
        }
        if (str.substring(0,2).equals(str.substring(str.length() - 2))){
            return true;
        }else
            return false;
    }
    // 27.
    public String minCat(String a, String b) {
        if(a.length() < b.length()){
            return a + b.substring(b.length() - a.length());
        } else if(b.length() < a.length()){
            return a.substring(a.length() - b.length()) + b;
        }else
            return a+b;
    }
    // 28.
    public String extraFront(String str) {
        String front;
        if (str.length() >= 2) {
            front = str.substring(0, 2);
        } else {
            front = str;
        }
        return front + front + front;
    }
    // 29.
    public String without2(String str) {
        if(str.length() >= 2 && str.substring(0,2).equals(str.substring(str.length() - 2))){
            return str.substring(2);
        } else
            return str;
    }
    // 30.
    public String deFront(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) == 'a') {
            result += "a";
        }
        if (str.length() >= 2 && str.charAt(1) == 'b') {
            result += "b";
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }


}
