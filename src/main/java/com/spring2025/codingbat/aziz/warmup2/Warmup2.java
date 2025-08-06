package com.spring2025.codingbat.aziz.warmup2;

public class Warmup2 {


    public String stringTimes(String str, int n) {
        String result = "";
        for(int i = 0; i < n; i++){
            result += str;
        }
        return result;
    }


    public String frontTimes(String str, int n) {
        String front = "";
        String result = "";
        if(str.length()<3){
            front = str;
        }else {
            front = str.substring(0, 3);
        }
        for(int i = 0; i < n; i++){
            result += front;
        }
        return result;
    }


    int countXX(String str) {
        int count = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.substring(i,i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }


    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1){
            return false;
        }
        if (i + 1 >= str.length()){
            return false;
        }
        return str.substring(i+1, i+2).equals("x");
    }


    public String stringBits(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i +=2){
            result += str.charAt(i);
        }
        return result;
    }


    public String stringSplosion(String str) {
        String result = "";
        for(int i = 0; i <= str.length(); i++){
            result +=  str.substring(0,i);
        }
        return result;
    }


    public int last2(String str) {
        if(str.length()<2)return 0;
        String last2 = str.substring(str.length() - 2);
        int count = 0;
        for ( int i = 0; i < str.length()-2; i++){
            if(str.substring(i,i+2).equals(last2)){
                count++;
            }
        }
        return count;
    }


    public int arrayCount9(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 9){
                count ++;
            }
        }
        return count;
    }


    public boolean arrayFront9(int[] nums) {
        int end = nums.length;
        if(end > 4) end = 4;
        boolean front9 = false;
        for(int i = 0; i < end; i++){
            if(nums[i] == 9){
                front9 = true;
            }
        }
        return front9;
    }


    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2] == 3){
                return true;
            }
        }return false;
    }


    public int stringMatch(String a, String b) {
        int len = Math.min(a.length(), b.length());
        int count = 0;
        for(int i = 0; i < len - 1; i++){
            String a2 = a.substring(i, i+2);
            String b2 = b.substring(i, i+2);
            if(a2.equals(b2)){
                count++;
            }
        }
        return count;
    }


    public String stringX(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }


    public String altPairs(String str) {
        String result = "";
        for(int i = 0; i < str.length(); i+=4){
            int end = i + 2;
            if(end > str.length()){
                end = str.length();
            }
            result += str.substring(i,end);
        }
        return result;
    }


    public String stringYak(String str) {
        String result = "";
        for(int i = 0; i<str.length(); i++){
            if(i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k'){
                i = i + 2;
            }else {
                result = result + str.charAt(i);
            }
        }
        return result;
    }


    public int array667(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length -1; i++){
            if(nums[i]== 6 && nums[i+1]== 6 || nums[i+1]==7){
                count ++;
            }
        }
        return count;
    }


    public boolean noTriples(int[] nums) {
        boolean no3 = true;
        for(int i = 0; i < nums.length - 2; i++){
            if(nums[i]==nums[i+1] && nums[i]==nums[i+2]){
                no3 = false;
            }
        }
        return no3;
    }



}
