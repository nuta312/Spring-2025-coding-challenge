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

    public boolean endsLy(String str) {
        if (str.endsWith("ly")) {
            return true;
        } else {
            return false;
        }
    }

    public String nTwice(String str, int n) {
        String result = "";
        String str1 = str.substring(0, n);
        String str2 = str.substring(str.length() - n);
        return result = str1 + str2;
    }

    public String twoChar(String str, int index) {
        if (index < 0 || index > str.length() - 2) {
            return str.substring(0, 2);
        } else {
            return str.substring(index, index + 2);
        }
    }

    public String middleThree(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() >= 3) {
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
            if (str.length() >= 4 && str.substring(1, 4).equals("bad"))
                return true;
        }
        return false;
    }

    public String atFirst(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "@";
        } else {
            return "@" + "@";
        }
    }

    public String lastChars(String a, String b) {
        if (a.length() >= 1 && b.length() > 1) {
            return a.charAt(0) + b.substring(b.length() - 1);
        }
        if (a.length() == 0 && b.length() == 0) {
            return "@@";
        }
        if (a.length() >= 2 && b.length() == 0) {
            return a.substring(0, 1) + b.replace("", "@");
        } else {
            return a.replace("", "@") + b.substring(b.length() - 1);
        }
    }

    public String conCat(String a, String b) {
        if (a.length() > 0 && b.length() > 0 && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        } else {
            return a + b;
        }
    }

    public String lastTwo(String str) {
        if (str.length() < 2) return str;

        String one = str.substring(0, str.length() - 2);
        char two = str.charAt(str.length() - 1);
        char three = str.charAt(str.length() - 2);
        return one + two + three;
    }

    public String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;

        String s = str.substring(0, 2);
        String ss = str.substring(str.length() - 2);
        return s.equals(ss);
    }

    public String minCat(String a, String b) {
        int minLength = Math.min(a.length(), b.length());

        String str1 = a.substring(a.length() - minLength);
        String str2 = b.substring(b.length() - minLength);

        return str1 + str2;
    }

    public String extraFront(String str) {
        if (str.length() <= 2) {
            return str + str + str;
        }
        String str1 = str.substring(0, 2);
        return str1 + str1 + str1;
    }

    public String without2(String str) {
        if (str.length() >= 2) {
            String start = str.substring(0, 2);
            String end = str.substring(str.length() - 2);
            if (start.equals(end)) {
                return str.substring(2);
            }
        }
        return str;
    }

    public String deFront(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == ('a')) {
            result += "a";
        }
        if (str.length() >= 2 && str.charAt(1) == ('b')) {
            result += "b";
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }

    public String startWord(String str, String word) {
        int len = word.length();

        if (str.length() < len) {
            return "";
        }
        String s = str.substring(1, len);
        String ss = word.substring(1);

        if (s.equals(ss)) {
            return str.substring(0, len);
        }
        return "";
    }

    public String withoutX(String str) {
        if (str.length() >= 1 && str.charAt(0) == 'x') {
            str = str.substring(1);
        }
        if (str.length() >= 1 && str.charAt(str.length() - 1) == 'x') {
            str = str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String withoutX2(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }




}