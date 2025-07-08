package com.spring2025.codingbat.talgat.warmup2;

public class Warmup {
    public static void main(String[] args) {

    }
    // 1
    public String stringTimes(String str, int n) {
        String strN = "";
        for(int i = 1;i<=n;i++){
            strN = strN+str;
        }
        return strN;
    }

    public String frontTimes(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            if (str.length()>3){
                String test = str.substring(0,3);
                result+=test;
            }else {
                result+=str;
            }
        }
        return result;
    }

    int countXX(String str) {
        int result = 0;
        int count = 0;
        for (char ch: str.toCharArray()){
            if (Character.toString(ch).equalsIgnoreCase("x")){
                if ((str.length()-1) > count && str.substring(count, count + 2).equalsIgnoreCase("xx"))
                    result+=1;
            }
            count++;
        }
        return result;
    }

    public String stringBits(String str) {
        String result = "";
        int count = 0;
        for (char ch: str.toCharArray()){
            if (count%2==0){
                result+=ch;
            }
            count++;
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(0,i+1);
        }
        return result;
    }

    public int last2(String str) {
        int result = 0;
        if (str.length()>3) {
            String str1 = str.substring(str.length() - 2);
            String str2 = str.substring(0, str.length() - 2);
            for (int i = 0; i < str2.length(); i++) {
                if (str.substring(i,i+2).equalsIgnoreCase(str1)){
                    result+=1;
                }
            }
        }
        return result;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i: nums){
            if (i == 9){
                count+=1;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int count = 0;
        boolean result = false;
        for (int i: nums){
            if (count<4&&i==9){
                result = true;
            }
            count++;
        }
        return result;
    }

    public boolean array123(int[] nums) {
        int count = 0;
        boolean result = false;
        for (int i: nums){
            if (i == 1 && count<nums.length-2){
                if (nums[count+1]==2 && nums[count+2]==3){
                    result = true;
                    break;
                }
            }
            count++;
        }
        return result;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int result =0;
        while (a.length()-2>=count&&b.length()-2>=count){
            if (a.substring(count,count+2).equalsIgnoreCase(b.substring(count,count+2))){
                result+=1;
            }
            count++;
        }
        return result;
    }

    public String stringX(String str) {
        String result = "";
        if (str.length() > 2) {
            result = str.substring(0, 1);
            for (int i = 1; i < str.length() - 1; i++) {
                if (str.charAt(i) != 'x') {
                    result += str.charAt(i);
                }
            }
            result = result + str.substring(str.length() - 1);
        }else {
            result = str;
        }
        return result;
    }

    public String altPairs(String str) {
        String t = "";
        int count = 0;
        int lCount = 2;
        while (count<str.length()){
            if (lCount<=str.length()) {
                t += str.substring(count, lCount);
            }else {
                t += str.substring(count);
            }
            count += 4;
            lCount += 4;
        }
        return t;
    }

    public int array667(int[] nums) {
        int result = 0;
        int count = 0;

        for (int i: nums){
            if (i == 6 && nums.length-1 > count){
                if (nums[count+1]==6||nums[count+1]==7) {
                    result += 1;
                }
            }
            count++;
        }
        return result;
    }

    public boolean noTriples(int[] nums) {
        int count = 0;

        boolean result = true;
        if (nums.length==0){
            result = true;
        }else {
            int t = nums[0];
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == t) {
                    count += 1;
                    if (count == 3) {
                        result = false;
                        break;
                    }
                } else {
                    count = 1;
                }
                t = nums[i];
            }
        }
        return result;
    }


}
