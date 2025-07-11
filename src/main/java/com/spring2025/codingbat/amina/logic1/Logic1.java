package com.spring2025.codingbat.amina.logic1;

public class Logic1 {

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
}
