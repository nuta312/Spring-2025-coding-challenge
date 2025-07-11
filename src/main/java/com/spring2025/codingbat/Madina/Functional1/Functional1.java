package com.spring2025.codingbat.Madina.Functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    public static void main(String[] args) {
        /*
        @author Madina
         */
    }
    /*Given a list of integers, return a list where each integer is multiplied by 2.
    doubling([1, 2, 3]) → [2, 4, 6]
    doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
    doubling([]) → []
     */
    public List<Integer> doubling(List<Integer> nums) {
        return nums.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
    }
  /*  Given a list of strings, return a list where each string has "*" added at its end.
    addStar(["a", "bb", "ccc"]) → ["a*", "bb*", "ccc*"]
    addStar(["hello", "there"]) → ["hello*", "there*"]
   */
  public List<String> addStar(List<String> strings) {
      strings.replaceAll(n->n+"*");
      return strings;
  }
  /*  Given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together
    copies3(["a", "bb", "ccc"]) → ["aaa", "bbbbbb", "ccccccccc"]
    copies3(["24", "a", ""]) → ["242424", "aaa", ""]
    copies3(["hello", "there"]) → ["hellohellohello", "theretherethere"]
   */
  public List<String> copies3(List<String> strings) {
      strings.replaceAll(n->n+n+n);
      return strings;
  }
   /* Given a list of strings, return a list where each string has "y" added at its start and end.
    moreY(["a", "b", "c"]) → ["yay", "yby", "ycy"]
    moreY(["hello", "there"]) → ["yhelloy", "ytherey"]
    moreY(["yay"]) → ["yyayy"]
    */
   public List<String> moreY(List<String> strings) {
       strings.replaceAll(n->"y"+n+"y");
       return strings;
   }
   /* Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.
    math1([1, 2, 3]) → [20, 30, 40]
    math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
    math1([10]) → [110]

    */
   public List<Integer> math1(List<Integer> nums) {
       nums.replaceAll(n-> n*10+10);
       return nums;
   }
  /*  Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)
    rightDigit([1, 22, 93]) → [1, 2, 3]
    rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
    rightDigit([10, 0]) → [0, 0]
     */
  public List<Integer> rightDigit(List<Integer> nums) {
      nums.replaceAll(n -> n % 10);
      return nums;
  }
}
