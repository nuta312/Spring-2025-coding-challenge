package com.spring2025.codingbat.eldiyar.functional2;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {
    public static void main(String[] args) {

    }

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(s -> (s >= 0)).collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(s -> (s % 10 != 9)).collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {
        return nums.stream().filter(s -> s < 13 | s > 19).collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        return strings.stream().filter(s->!s.contains("z")).collect(Collectors.toList());
    }

    public List<String> noLong(List<String> strings) {
        return strings.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
    }

    public List<String> no34(List<String> strings) {
        return strings.stream().filter(s ->  s.length() < 3 | s.length() >= 5).collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s + "y").filter(s -> !s.contains("yy")).collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(s -> (s * 2)).filter(s->s%10 != 2).collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(s -> (s * s) + 10 ).filter(s -> s % 10 != 5 & s % 10 !=6).collect(Collectors.toList());
    }

}