package com.spring2025.codingbat.amina.logic_1;
import java.util.*;
/**
 * @author Amina
 */
public class Logic_1 {


    /**
     Task 1 – cigarParty

     When squirrels get together for a party, they like to have cigars.
     A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
     Unless it is the weekend — then there is no upper bound on the number of cigars.

     cigarParty(30, false) → false
     cigarParty(50, false) → true
     cigarParty(70, true) → true
     */
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return cigars >= 40;
        } else {
            return cigars >= 40 && cigars <= 60;
        }
    }

    /**
     Task 2 — caughtSpeeding

     You are driving a little too fast, and a police officer stops you.
     Write code to compute the result: 0=no ticket, 1=small ticket, 2=big ticket.
     If speed is 60 or less, the result is 0.
     If speed is between 61 and 80 inclusive, the result is 1.
     If speed is 81 or more, the result is 2.
     Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.

     Examples:
     caughtSpeeding(60, false) → 0
     caughtSpeeding(65, false) → 1
     caughtSpeeding(65, true) → 0
     */
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int allowance = isBirthday ? 5 : 0;

        if (speed <= 60 + allowance) return 0;
        if (speed <= 80 + allowance) return 1;
        return 2;
    }

    /**
     Task 3 — love6

     The number 6 is a truly great number.
     Given two int values, a and b, return true if either one is 6.
     Or if their sum or difference is 6.

     Examples:
     love6(6, 4) → true
     love6(4, 5) → false
     love6(1, 5) → true
     */
    public boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }

    /**
     Task 4 — more20

     Return true if the given non-negative number is 1 or 2 more than a multiple of 20.

     Examples:
     more20(20) → false
     more20(21) → true
     more20(22) → true
     */
    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    /**
     Task 5 — nearTen

     Given a non-negative number "num", return true if num is within 2 of a multiple of 10.

     Examples:
     nearTen(12) → true
     nearTen(17) → false
     nearTen(19) → true
     */
    public boolean nearTen(int num) {
        int mod = num % 10;
        return mod <= 2 || mod >= 8;
    }

    /**
     Task 6 — teaParty

     We are having a party with amounts of tea and candy.
     Return the int outcome of the party:
     0=bad, 1=good, 2=great.
     A party is good (1) if both tea and candy are at least 5.
     However, if either is at least double the other, the party is great (2).
     Otherwise it's bad (0).

     Examples:
     teaParty(6, 8) → 1
     teaParty(3, 8) → 0
     teaParty(20, 6) → 2
     */
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;
    }

    /**
     Task 7 — twoAsOne

     Given three ints, a b c, return true if it is possible to add two of the ints
     to get the third.

     Examples:
     twoAsOne(1, 2, 3) → true
     twoAsOne(3, 1, 2) → true
     twoAsOne(3, 2, 2) → false
     */
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }

    /**
     Task 8 — lastDigit

     Given three ints, a b c, return true if two or more of them have the same rightmost digit.

     Examples:
     lastDigit(23, 19, 13) → true
     lastDigit(23, 19, 12) → false
     lastDigit(23, 19, 3) → true
     */
    public boolean lastDigit(int a, int b, int c) {
        int a1 = a % 10, b1 = b % 10, c1 = c % 10;
        return a1 == b1 || a1 == c1 || b1 == c1;
    }

    /**
     Task 9 — maxMod5

     Return the larger value. However if the two values have the same remainder when divided by 5,
     then return the smaller value. However, in all cases, if the two values are the same, return 0.

     Examples:
     maxMod5(2, 3) → 3
     maxMod5(6, 2) → 6
     maxMod5(3, 2) → 3
     */
    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        if (a % 5 == b % 5) return Math.min(a, b);
        return Math.max(a, b);
    }

    /**
     Task 10 — blueTicket

     You have a blue lottery ticket, with ints a, b, and c on it.
     This makes three pairs, which sum to a+b, b+c, and a+c.
     If any pair sums to exactly 10, return 10.
     If the sum of a+b is exactly 10 more than either of the other two sums, return 5.
     Otherwise return 0.

     Examples:
     blueTicket(9, 1, 0) → 10
     blueTicket(9, 2, 0) → 0
     blueTicket(6, 1, 4) → 10
     */
    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) return 10;
        if (ab == bc + 10 || ab == ac + 10) return 5;
        return 0;
    }

    /**
     Task 11 — dateFashion

     You and your date are trying to get a table at a restaurant.
     The parameter "you" is the stylishness of your clothes, in the range 0..10,
     and "date" is the stylishness of your date's clothes.
     The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes.
     If either of you is very stylish (8 or more), then the result is 2 (yes).
     With the exception that if either of you is very unstylish (2 or less), the result is 0 (no).
     Otherwise the result is 1 (maybe).

     Examples:
     dateFashion(5, 10) → 2
     dateFashion(5, 2) → 0
     dateFashion(5, 5) → 1
     */
    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) return 0;
        if (you >= 8 || date >= 8) return 2;
        return 1;
    }

    /**
     Task 12 — sortaSum

     Given 2 ints, a and b, return their sum. However, if the sum is in the range 10..19 inclusive,
     return 20 instead.

     Examples:
     sortaSum(3, 4) → 7
     sortaSum(9, 4) → 20
     sortaSum(10, 11) → 21
     */
    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) return 20;
        return sum;
    }

    /**
     Task 13 — in1To10

     Given a number n, return true if n is in the range 1..10, inclusive.
     Unless "outsideMode" is true, in which case return true if the number is <= 1 or >= 10.

     Examples:
     in1To10(5, false) → true
     in1To10(11, false) → false
     in1To10(11, true) → true
     */
    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) return n <= 1 || n >= 10;
        return n >= 1 && n <= 10;
    }

    /**
     Task 14 — old35

     Return true if the given non-negative number is a multiple of 3 or 5,
     but not both.

     Examples:
     old35(3) → true
     old35(10) → true
     old35(15) → false
     */
    public boolean old35(int n) {
        return (n % 3 == 0) ^ (n % 5 == 0); // XOR
    }

    /**
     Task 15 — teenSum

     Given 2 ints, a and b, return their sum. However, if either value is a "teen" — in the range 13..19 inclusive —
     then return 19.

     Examples:
     teenSum(3, 4) → 7
     teenSum(10, 13) → 19
     teenSum(13, 2) → 19
     */
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) return 19;
        return a + b;
    }

    /**
     Task 16 - fizzString

     Given a string str, if the string starts with "f" return "Fizz".
     If it ends with "b" return "Buzz".
     If both → return "FizzBuzz".
     Otherwise, return the string itself.

     fizzString("fig") → "Fizz"
     fizzString("dib") → "Buzz"
     fizzString("fib") → "FizzBuzz"
     */

    public String fizzString(String str) {
        boolean startsWithF = str.startsWith("f");
        boolean endsWithB = str.endsWith("b");

        if (startsWithF && endsWithB) return "FizzBuzz";
        if (startsWithF) return "Fizz";
        if (endsWithB) return "Buzz";

        return str;
    }

    /**
     Task 17 - inOrder

     Given three ints, a b c, return true if b is greater than a, and c is greater than b.
     However, with the exception that if "bOk" is true, b does not need to be greater than a.

     inOrder(1, 2, 4, false) → true
     inOrder(1, 2, 1, false) → false
     inOrder(1, 1, 2, true) → true
     */

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        }
        return b > a && c > b;
    }

    /**
     Task 18 - lessBy10

     Given three ints, a b c, return true if one of them is 10 or more less than one of the others.

     lessBy10(1, 7, 11) → true
     lessBy10(1, 7, 10) → false
     lessBy10(11, 1, 7) → true
     */

    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10;
    }

    /**
     Task 19 - redTicket

     You have a red lottery ticket with integers a, b, and c.
     If all are 2 → return 10
     If all are same → return 5
     If a ≠ b and c → return 1
     Else → return 0

     redTicket(2, 2, 2) → 10
     redTicket(2, 2, 1) → 0
     redTicket(0, 0, 0) → 5
     */

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        if (a == b && b == c) return 5;
        if (a != b && a != c) return 1;
        return 0;
    }

    /**
     Task 20 - shareDigit

     Given two ints in the range 10..99, return true if they share a digit.

     shareDigit(12, 23) → true
     shareDigit(12, 43) → false
     shareDigit(12, 44) → false
     */

    public boolean shareDigit(int a, int b) {
        int a1 = a / 10, a2 = a % 10;
        int b1 = b / 10, b2 = b % 10;
        return a1 == b1 || a1 == b2 || a2 == b1 || a2 == b2;
    }

    /**
     Task 21 - squirrelPlay

     The squirrels play if temp is between 60 and 90 inclusive.
     Unless it's summer → upper limit is 100.

     squirrelPlay(70, false) → true
     squirrelPlay(95, false) → false
     squirrelPlay(95, true) → true
     */

    public boolean squirrelPlay(int temp, boolean isSummer) {
        int upper = isSummer ? 100 : 90;
        return temp >= 60 && temp <= upper;
    }

    /**
     Task 22 - alarmClock

     Weekdays: alarm at "7:00", weekends: "10:00".
     If on vacation → weekdays "10:00", weekends "off".

     alarmClock(1, false) → "7:00"
     alarmClock(0, false) → "10:00"
     alarmClock(0, true) → "off"
     */

    public String alarmClock(int day, boolean vacation) {
        boolean isWeekend = (day == 0 || day == 6);
        if (vacation) {
            return isWeekend ? "off" : "10:00";
        }
        return isWeekend ? "10:00" : "7:00";
    }

    /**
     Task 23 - specialEleven

     Return true if n is a multiple of 11 or one more than a multiple of 11.

     specialEleven(22) → true
     specialEleven(23) → true
     specialEleven(24) → false
     */

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    /**
     Task 24 - less20

     Return true if n is 1 or 2 less than a multiple of 20.

     less20(18) → true
     less20(19) → true
     less20(20) → false
     */

    public boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }








}
