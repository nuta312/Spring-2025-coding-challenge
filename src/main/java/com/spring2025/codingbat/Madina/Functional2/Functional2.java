package com.spring2025.codingbat.Madina.Functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    public static void main(String[] args) {
        /*
        @author Madina
         */
    }
   /* Given a list of integers, return a list of the integers, omitting any that are less than 0.
    noNeg([1, -2]) → [1]
    noNeg([-3, -3, 3, 3]) → [3, 3]
    noNeg([-1, -1, -1]) → []
    */
   public List<Integer> noNeg(List<Integer> nums) {
       return nums.stream().filter(n->n>=0).collect(Collectors.toList());
   }
   /* Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)
    no9([1, 2, 19]) → [1, 2]
    no9([9, 19, 29, 3]) → [3]
    no9([1, 2, 3]) → [1, 2, 3]
      */
   public List<Integer> no9(List<Integer> nums) {
       return nums.stream().filter(n->n%10 !=9).collect(Collectors.toList());
   }
  /*  Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.


            noTeen([12, 13, 19, 20]) → [12, 20]
    noTeen([1, 14, 1]) → [1, 1]
    noTeen([15]) → []

   */
  public List<Integer> noTeen(List<Integer> nums) {
      return nums.stream().filter(n-> n<13 || n > 19).collect(Collectors.toList());
  }
   /* Given a list of strings, return a list of the strings, omitting any string that contains a "z". (Note: the str.contains(x) method returns a boolean)
    noZ(["aaa", "bbb", "aza"]) → ["aaa", "bbb"]
    noZ(["hziz", "hzello", "hi"]) → ["hi"]
    noZ(["hello", "howz", "are", "youz"]) → ["hello", "are"]
    */
   public List<String> noZ(List<String> strings) {
       return strings.stream().filter(n->!n.contains("z")).collect(Collectors.toList());
   }
    /*Given a list of strings, return a list of the strings, omitting any string length 4 or more.



    noLong(["this", "not", "too", "long"]) → ["not", "too"]
    noLong(["a", "bbb", "cccc"]) → ["a", "bbb"]
    noLong(["cccc", "cccc", "cccc"]) → []

     */
    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(s->s.length()<=3).collect(Collectors.toList());
    }
   /* Given a list of strings, return a list of the strings, omitting any string length 3 or 4.


    no34(["a", "bb", "ccc"]) → ["a", "bb"]
    no34(["a", "bb", "ccc", "dddd"]) → ["a", "bb"]
    no34(["ccc", "dddd", "apple"]) → ["apple"]

    */
   public List<String> no34(List<String> strings) {
       return strings.stream().filter(s->s.length()!=3 && s.length() !=4)
               .collect(Collectors.toList());
   }
    /*Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.


    noYY(["a", "b", "c"]) → ["ay", "by", "cy"]
    noYY(["a", "b", "cy"]) → ["ay", "by"]
    noYY(["xx", "ya", "zz"]) → ["xxy", "yay", "zzy"]

     */
    public List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s.concat("y")).filter(s->!s.contains("yy")).collect(Collectors.toList());
    }
   /* Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.


    two2([1, 2, 3]) → [4, 6]
    two2([2, 6, 11]) → [4]
    two2([0]) → [0]

    */
   public List<Integer> two2(List<Integer> nums) {
       return nums.stream().map(n ->n*2).filter(n->n%10 !=2 ).collect(Collectors.toList());
   }
  /*  Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6.


    square56([3, 1, 4]) → [19, 11]
    square56([1]) → [11]
    square56([2]) → [14]

   */
  public List<Integer> square56(List<Integer> nums) {
      return nums.stream().map(n ->(n*n)+10).filter(n ->n%10 !=5 && n%10 !=6).collect(Collectors.toList());
  }


}
