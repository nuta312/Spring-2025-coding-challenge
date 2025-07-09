package com.spring2025.codingbat.altynai.functional1;

import java.util.ArrayList;
import java.util.List;

public class Functional1 {
    public static void main(String[] args) {

    }


    // Given a list of integers, return a list where each integer is multiplied by 2.
    //doubling([1, 2, 3]) → [2, 4, 6]
    //doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
   // doubling([]) → []

    public static List<Integer>doubling (List<Integer>nums){
        List<Integer>doubling=new ArrayList();
        for(int num:nums){
            doubling.add(num*2);
        }
        return doubling;
    }

    //Given a list of strings,
    // return a list where each string is replaced by 3 copies of the string concatenated together.
    //copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    //copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    //copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]

    public static List<String> copies3(List<String>strings){
        List<String>result=new ArrayList<>();

        for(String s:strings){
            StringBuilder tripled=new StringBuilder();
           for(int i=0; i<3; i++){
               tripled.append(s);
            }
            result.add(tripled.toString());
        }
       return result;
   }

   //Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
   //
   //
   //rightDigit([1, 22, 93]) → [1, 2, 3]
   //rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
   //rightDigit([10, 0]) → [0, 0]
   public static List<Integer>rightDigit(List<Integer>nums){
       List<Integer> result=new ArrayList<>();
       for(Integer num:nums){
           int lastDigit=num % 10;
           result.add(lastDigit);
       }
       return result;
   }

   //Given a list of integers, return a list where each integer is multiplied with itself.
   //
   //
   //square([1, 2, 3]) → [1, 4, 9]
   //square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
   //square([]) → []

   public static List<Integer> square (List<Integer> nums){

       List<Integer>square=new ArrayList();
       for(int num:nums){
           square.add(num*num);
       }
       return square;
   }

   //Given a list of strings, return a list where each string has "y" added at its start and end.
   //
   //
   //moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
   //moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
   //moreY(["yay"]) → ["yyayy"]

   public static List<String> moreY(List<String>strings){
       List<String> result=new ArrayList<>();
       String element="y";
       for(String s:strings){
           result.add("y" + s + "y");

       }
       return result;
   }
   //Given a list of strings, return a list where each string is converted to lower case (Note: String toLowerCase() method).
    //
    //
    //lower(["Hello", "Hi"]) → ["hello", "hi"]
    //lower(["AAA", "BBB", "ccc"]) → ["aaa", "bbb", "ccc"]
    //lower(["KitteN", "ChocolaTE"]) → ["kitten", "chocolate"]

   public static List<String> lower (List<String> strings){
       List<String> result=new ArrayList<>();
       for(String s:strings){
           result.add(s.toLowerCase());
       }
       return result;
   }

   //Given a list of strings, return a list where each string has "*" added at its end.
    //
    //
    //addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
    //addStar(["hello", "there"]) → ["hello*", "there*"]
    //addStar(["*"]) → ["**"]

   public static List<String> addStar(List<String>strings){
       List<String>addStar=new ArrayList();
       for(String s:strings){
           addStar.add(s + "*");
       }
       return addStar;
   }

   //Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
   //
   //
   //math1([1, 2, 3]) → [20, 30, 40]
   //math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
   //math1([10]) → [110]

   public static List<Integer>math1(List<Integer> nums){

       List<Integer> result=new ArrayList<>();
       for(int i=0; i<nums.size(); i++){
           int value= (nums.get(i) +1) *10;
           result.add(value);

       }
       return result;
   }


   //Given a list of strings, return a list where each string has all its "x" removed.//noX(["ax", "bb", "cx"]) → ["a", "bb", "c"]
    //noX(["xxax", "xbxbx", "xxcx"]) → ["a", "bb", "c"]
    //noX(["x"]) → [""]

   public static List<String> noX(List<String>strings){

       List<String> result=new ArrayList<>();
       for(String s: strings){
           String str=s.replace("x", "");
           result.add(str);


       }
       return result;
   }
}
