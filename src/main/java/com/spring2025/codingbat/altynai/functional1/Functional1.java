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
}
