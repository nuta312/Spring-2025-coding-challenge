package com.spring2025.codingbat.aliia.string1;

public class String1 {

    public String helloName(String name) {
        return "Hello " + name +"!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        int n2 = str.length() - 2;
        String a = str.substring(n2);
        return a + a + a;
    }

    public String firstTwo(String str) {
        if (str.length() > 2) {
            return str.substring(0,2);
        } else {
            return str;
        }
    }

    public String firstHalf(String str) {
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return str;
        }
    }

    public String withoutEnd(String str) {
        return str.substring(str.length() - (str.length() -1),str.length() - 1) ;
    }

    public String comboString(String a, String b) {
        if ( a.length() > b.length() ) {
            return b + a + b;
        } else {
            return a + b + a;
        }
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        String str2 = str;
        if(str.length() > 2) {
            char f = str.charAt(0);
            char s = str.charAt(1);

            str2 = str.substring(2) + f + s;
        }
        return str2;
    }

    public String right2(String str) {
        String str2 = str;

        if(str.length() > 2) {
            str2 = String.valueOf(str.charAt(str.length() -2)) + str.charAt(str.length() -1) + str.substring(0,str.length() -2);
        }
        return str2;
    }

    public String theEnd(String str, boolean front) {
        return front ? String.valueOf(str.charAt(0)) : String.valueOf(str.charAt(str.length() - 1));
    }

    public String withouEnd2(String str) {
        String result = "";

        if(str.length() > 2) {
            result = str.substring(1,str.length() - 1);
        }

        return result;
    }

    public String middleTwo(String str) {
        String newStr = "";
        int i = 0;

        if(str.length() % 2 == 0) {
            newStr = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        }
        return newStr;
    }

    public boolean endsLy(String str) {
        boolean result = false;

        if (str.length() > 1) {
            if (str.lastIndexOf("ly") == str.length() - 2) {
                result = true;
            }
        }


        return result;
    }

    public String nTwice(String str, int n) {
        return str.substring(0,n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        String result = str.substring(0,2);

        if(str.length() - 1 > index && index >= 0) {
            result = str.substring(index, index + 2);
        }

        return result;
    }

    public String middleThree(String str) {
        String result = str;

        if(str.length() > 3) {
            int i = str.length() / 2;

            result = str.substring(i - 1, i + 2 );
        }
        return result;
    }

    public boolean hasBad(String str) {
        if(str.contains("bad")) {
            if(str.charAt(0) == 'b' || str.charAt(1) == 'b') {
                return  true;
            }
        }

        return false;
    }

    public String atFirst(String str) {
        String result = "";

        if(str.length() >= 2) {
            result = str.substring(0,2);
        } else if(str.length() == 1) {
            result = str + "@";
        } else {
            result = "@@";
        }

        return result;
    }

    public String lastChars(String a, String b) {
        String result = "";

        if(a.isEmpty() && !b.isEmpty()) {
            result = "@" + b.charAt(b.length() - 1);
        } else if (b.isEmpty() && !a.isEmpty()) {
            result = a.charAt(0) + "@";
        } else if (!a.isEmpty() && !b.isEmpty()) {
            result = a.charAt(0) + "" + b.charAt(b.length() - 1);
        } else {
            result = "@@";
        }

        return result;
    }

    public String conCat(String a, String b) {
        if (!a.isEmpty() && !b.isEmpty() && a.charAt(a.length() - 1) == b.charAt(0)) {
            return a + b.substring(1);
        }
        return a + b;
    }

    public String lastTwo(String str) {
        String result = str;

        if(str.length() >= 2) {
            result = str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
        }

        return result;
    }

    public String seeColor(String str) {
        if((str.contains("red") && str.charAt(0) == 'r')) {
            return str.substring(0,3);
        } else if (str.contains("blue") && str.charAt(0) == 'b') return str.substring(0,4);
        return "";
    }

    public boolean frontAgain(String str) {
        if(str.length() > 2) {
            if(str.substring(0,2).equals(str.substring(str.length() - 2))) {
                return true;
            }
        } else if (str.length() == 2) {
            return true;
        }

        return false;
    }

    public String minCat(String a, String b) {
        String result = a + b;

        if(a.length() > b.length()) {
            result = a.substring(a.length() - b.length()) + b;
        } else if (b.length() > a.length()) {
            result = a + b.substring(b.length() - a.length());
        }

        return result;
    }

    public String extraFront(String str) {
        if(str.length() >= 2) {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        } else  {
            return str + str + str;
        }
    }

    public String without2(String str) {
        String result = str;

        if(str.length() > 2 && str.substring(0,2).equals(str.substring(str.length()-2))) {
            result = str.substring(2);
        } else if(str.length() == 2) {
            result = "";
        }

        return result;
    }

    public String deFront(String str) {
        String result = str.substring(2);

        if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
            result = str;
        } else if(str.charAt(0) == 'a') {
            result = str.charAt(0) + str.substring(2);
        } else if(str.charAt(1) == 'b') {
            result = str.substring(1);
        }

        return result;
    }

    public String startWord(String str, String word) {
        String result = "";

        if(str.length() >= word.length()) {
            if (word.length() == 1) {
                result = String.valueOf(str.charAt(0));
            } else if (str.substring(1, word.length()).equals(word.substring(1))) {
                result = str.substring(0, word.length());
            }
        }
        return  result;
    }

    public String withoutX(String str) {
        String result = str;

        if(str.length() >= 2) {
            if(str.charAt(0) == 'x') {
                result = str.substring(1);
            }

            if(str.charAt(str.length() - 1) == 'x') {
                result = result.substring(0, result.length() - 1);
            }
        } else if(str.length() == 1) {
            if(str.equals("x")) {
                result = "";
            }
        }
        else {
            result = str;
        }

        return result;
    }

    public String withoutX2(String str) {
        String result = "";
        if(str.length() == 1 && str.charAt(0) == 'x') return result = "";

        if(str.length() >= 2 && str.substring(0,2).contains("x")) {
            result = str.substring(0,2).replace("x", "");
            return result + str.substring(2);
        }

        return str;
    }
}
