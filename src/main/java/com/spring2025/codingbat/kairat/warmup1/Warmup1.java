package com.spring2025.codingbat.kairat.warmup1;

public class Warmup1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (weekday && vacation) || !weekday;
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public int sumDouble(int a, int b) {
        if (a == b) return (a + b) * 2;
        return a + b;
    }

    public int diff21(int n) {
        return (n >= 21) ? (n - 21) * 2 : 21 - n;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)) {
            return true;
        } else return false;
    }

    public boolean makes10(int a, int b) {
        return (a == 10 || b == 10) || a + b == 10;
    }

    public boolean nearHundred(int n) {
        int a = n - 100;
        int b = n - 200;
        if ((Math.abs(a) <= 10) || (Math.abs(b) <= 10)) {
            return true;
        } else return false;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        // return (a<0&&b<0)&&negative ? true : false;
        if (a < 0 && b < 0 && negative) {
            return true;
        } else if (((a > 0 && b < 0) || (a < 0 && b > 0)) && !negative) {
            return true;
        } else return false;
    }

    public String notString(String str) {
        if (str.length() < 3) {
            return "not " + str;
        }
        return str.substring(0, 3).equals("not") ? str : "not " + str;
    }

    public String missingChar(String str, int n) {
        StringBuilder del = new StringBuilder(str);

        return del.delete(n, n + 1).toString();
    }

    public String frontBack(String str) {
        if (str.length() > 1) {
            return str.substring(str.length() - 1, str.length()) + str.substring(1, str.length() - 1) + str.substring(0, 1);
        }
        return str;
    }

    public String front3(String str) {

        if (str.length() > 2) {
            String substr = str.substring(0, 3);
            return substr + substr + substr;
        } else return str + str + str;
    }

    public String backAround(String str) {

        return str.substring(str.length() - 1) + str + str.substring(str.length() - 1);

    }

    public boolean or35(int n) {
        return (n % 3 == 0 || n % 5 == 0);
    }

    public String front22(String str) {
        if (str.length() > 2) {
            return str.substring(0, 2) + str + str.substring(0, 2);
        }
        return str + str + str;
    }

    public boolean startHi(String str) {
        // return str.length()>1&& str.substring(0,2).equals("hi");
        return str.startsWith("hi");
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 119) || (temp1 > 119 && temp2 < 0);

    }

    public boolean in1020(int a, int b) {
        return (a > 9 && a < 21) || (b > 9 && b < 21);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a > 12 && a < 20) || (b > 12 && b < 20) || (c > 12 && c < 20);
    }

    public boolean loneTeen(int a, int b) {
//           teen   and      non      or    teen   and    non
        return (a >= 13 && a <= 19) ^ (b >= 13 && b <= 19);
    }

    public String delDel(String str) {
        return str.length() > 3 ? str.substring(0, 4).replace("del", "") + str.substring(4) : str;
    }

    public boolean mixStart(String str) {
        return str.length() > 2 && str.substring(1, 3).equals("ix");
    }

    public String startOz(String str) {
        if (!str.equals("")) {

            if (str.length() > 1 && str.substring(0, 1).equals("o") && str.substring(1, 2).equals("z")) {
                return "oz";
            } else if (str.substring(0, 1).equals("o")) {
                return "o";
            } else if (str.substring(1, 2).equals("z")) {
                return "z";
            }
            return "";

        } else return "";
    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else return c;
    }

    public int close10(int a, int b) {
        int neara = Math.abs(10 - a);
        int nearb = Math.abs(10 - b);
        if (neara < nearb) {
            return a;
        } else if (neara > nearb) {
            return b;
        } else return 0;
    }

    public boolean in3050(int a, int b) {
        return ((a > 29 && a < 41) && (b > 29 && b < 41)) || ((a > 39 && a < 51) && (b > 39 && b < 51));
    }

    public int max1020(int a, int b) {
        if ((a > 9 && a < 21) || (b > 9 && b < 21)) {
            if (a > 20) {
                return b;
            } else if (b > 20) {
                return a;
            } else if (b > a) {
                return b;
            } else return a;
        } else return 0;
    }

    public boolean stringE(String str) {
        String str1 = str.replace("e", "");
        int a = str.length() - str1.length();
        if (a > 0 && a <= 3) {
            return true;
        } else return false;
    }

    public boolean lastDigit(int a, int b) {
        return a%10==b%10;
    }

    public String endUp(String str) {
        if(str.length()<3){
            return str.toUpperCase();
        }else{
            return str.substring(0,str.length()-3)+ str.substring(str.length()-3).toUpperCase();
        }
    }

    public String everyNth(String str, int n) {
        String res = "";
        for(int i = 0;i<str.length();i+=n){
            res +=str.charAt(i);
        }
        return res;

    }


}
