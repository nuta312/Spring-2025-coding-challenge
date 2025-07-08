package com.spring2025.codingbat.aliia.warmup1;

public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation );
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile && bSmile) || (!aSmile && !bSmile);
    }

    public int sumDouble(int a, int b) {
        return a == b ? (a + b) * 2 : a + b;
    }

    public int diff21(int n) {
        if( 21 >= n ) {
            return 21 - n;
        }
        return (n - 21) *2;
    }

    public boolean parrotTrouble(boolean talking, int hour) {
        if ((talking && hour < 7) || (talking && hour > 20) ) {
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if(a == 10 || b == 10 || a + b == 10) {
            return true;
        }
        return false;
    }

    public boolean nearHundred(int n) {
        return  ((90 <= n && n <= 110) || (190 <= n && n <= 210)) ;
    }

    public boolean posNeg(int a, int b, boolean negative) {
        if (!negative && ((a > 0 && b < 0) || (a < 0 && b > 0))) {
            return true;
        } else if (negative && (a < 0 && b < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public String notString(String str) {
        boolean newStr = str.startsWith("not");

        if (!newStr) {
            return "not " + str;
        }

        return str;
    }

    public String missingChar(String str, int n) {
        if (!str.isEmpty()) {
            return str.substring(0, n) + str.substring(n + 1);
        }
        return "";
    }

    public String frontBack(String str) {
        if (str.length() > 1) {
            String n = str.substring(1, str.length()-1);

            return str.charAt(str.length()-1) + n + str.charAt(0);

        } else {
            return str;
        }
    }

    public String front3(String str) {
        int lenght1 = str.length();
        String word3 = "";

        if (lenght1 >= 3) {
            String word2 = str.substring(0, 3);
            for (int i = 0; i <= 2; i++) {
                word3 += word2;
            }
            return word3;
        } else {
            return str.concat(str).concat(str);
        }
    }

    public String backAround(String str) {
        char i = str.charAt(str.length() -1);
        return i + str + i;
    }

    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    public String front22(String str) {
        if (str.length() > 1) {
            String i = str.substring(0,2);
            return i + str + i;
        }
        return str + str + str;
    }

    public boolean startHi(String str) {
        if (str.length() > 1) {
            return str.substring(0,2).equals("hi");
        }
        return false;
    }

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        return (a >= 13 && a <= 19) && (b >= 13 && b <= 19) ? false : (a >= 13 && a <= 19) || (b >= 13 && b <= 19);
    }

    public String delDel(String str) {
        if (str.contains("del")) {
            int a1 = str.indexOf('d');
            int a2 = str.indexOf('e');
            int a3 = str.indexOf('l');

            if ( a1 == 1 && a1 + 1 == a2 && a2 + 1 == a3) {
                return str.charAt(0) + str.substring(4);
            }
        }
        return str;
    }

    public boolean mixStart(String str) {
        if (str.length() >= 3) {
            if (str.substring(1,3).equals("ix")) {
                return true;
            }
        }
        return false;
    }

    public String startOz(String str) {
        String result = "";
        int length = str.length();

        if(length > 1 && str.charAt(0) == 'o' && str.charAt(1) == 'z') {
            result = result + str.charAt(0)  + str.charAt(1) ;
        } else if (length >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        } else if (length >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }
        return result;

    }

    public int intMax(int a, int b, int c) {
        if (a > b && a > c ) {
            return a;
        } else if(b > c && b > a) {
            return b;
        } else {
            return c;
        }
    }

    public int close10(int a, int b) {
        return Math.abs(a - 10) > Math.abs(b - 10) ? b : Math.abs(a - 10) < Math.abs(b - 10) ? a : 0 ;
    }

    public boolean in3050(int a, int b) {
        if ((a >= 30 && a <= 40) && (b >= 30 && b <= 40)) {
            return true;
        } else if ((a >= 40 && a <= 50) && (b >= 40 && b <= 50)){
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        if ((a >= 10 && a <= 20) && (a > b))  {
            return a;
        } else if ((b >= 10 && b <= 20) && (a < b)) {
            return b;
        } else if ((a >= 10 && a <= 20) && (a < b)) {
            return a;
        } else if ((b >= 10 && b <= 20) && (a > b)) {
            return b;
        }

        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i <= str.length() -1 ; i ++ ) {
            if (str.charAt(i) == 'e') {
                count += 1;
            }
        }
        return count >= 1 && count <= 3;
    }

    public boolean lastDigit(int a, int b) {
        return a == b % 10 || b == a % 10;
    }

    public String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        } else {
            String last3 = str.substring(str.length() - 3);
            return str.replace(last3, last3.toUpperCase());
        }
    }

    public String everyNth(String str, int n) {
        String empty = "";
        for (int i = 0; i <= str.length() -1 ; i += n ) {
            empty = empty + str.charAt(i); // 0 - m  3 a // 4 c

        }
        return empty;
    }
}
