package com.spring2025.codingbat.elviraI.string2;

public class String2 {public String doubleChar(String str) {
    StringBuilder result =new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
        char c=str.charAt(i);
        result.append(c).append(c);
    }
    return result.toString();
}
    public int countHi(String str) {
        int count=0;
        for (int i = 0; i < str.length()-1; i++) {
            if(str.substring(i, i + 2).equals("hi")){
                count++;
            }
        }
        return count;
    }
    public boolean catDog(String str) {
        int countcat=0;
        int countdog=0;
        for (int i = 0; i < str.length()-2; i++) {
            if(str.substring(i, i + 3).equals("cat")){
                countcat++;
            }
            if(str.substring(i, i + 3).equals("dog")){
                countdog++;
            }
        }
        if (countcat==countdog){
            return true;
        }else{
            return false;
        }
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
