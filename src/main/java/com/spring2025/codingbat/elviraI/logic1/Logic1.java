package com.spring2025.codingbat.elviraI.logic1;

public class Logic1 {
    public int teenSum(int a, int b) {
        int sum = a + b;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return sum;
        }
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return ((!isMorning && !isMom && !isAsleep) || (!isMorning && isMom && !isAsleep)
                || (isMorning && isMom && !isAsleep));
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 5 && candy >= 5 && (tea / candy >= 2 || candy / tea >= 2)) {
            return 2;
        } else {
            return 1;

        }
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        }
        return str;
    }

    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            return n + "!";
        }
    }

    public boolean twoAsOne(int a, int b, int c) {
        return ((a + b == c) || (a + c == b) || (b + c == a));
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        return ((!bOk && c > b && b > a) || (bOk && c > b));
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        return ((!equalOk && c > b && b > a) || (equalOk && c >= b && b >= a));
    }

    public boolean lastDigit(int a, int b, int c) {
        int f1 = a % 10;
        int f2 = b % 10;
        int f3 = c % 10;
        return (f1 == f2 || f1 == f3 || f3 == f2);

    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10 || Math.abs(a - b) >= 10);
    }
//    Return the sum of two 6-sided dice rolls, each in the range 1..6. However, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6.
//
//    withoutDoubles(2, 3, true) → 5
//    withoutDoubles(3, 3, true) → 7
//    withoutDoubles(3, 3, false) → 6

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2 && die1 != 6) {
            return die1 + die2 + 1;
        } else if (noDoubles && die1 == die2 && die1 == 6) {
            return die1 + 1;
        } else if (!noDoubles && die1 == die2 && die1 == 6) {
            return die1 + die2;
        } else {
            return die1 + die2;
        }
    }

    //    Given two int values, return whichever value is larger. However if the two values have the same remainder when divided by 5, then the return the smaller value. However, in all cases, if the two values are the same, return 0. Note: the % "mod" operator computes the remainder, e.g. 7 % 5 is 2.
//
//    maxMod5(2, 3) → 3
//    maxMod5(6, 2) → 6
//    maxMod5(3, 2) → 3
    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        }
        if ((a % 5 == b % 5)) {
            return Math.min(a, b);
        }
        return Math.max(a, b);
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        } else if (a == b && b == c) {
            return 5;
        } else if (a == b && b != c) {
            return 0;
        } else if ((c == b && a != c) || (c != b && a != c)) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) {
            return 20;
        } else if (a == b || b == c || a == c) {
            return 10;
        } else {
            return 0;
        }
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int ac = a + c;
        int bc = b + c;
        if (ac == 10 || ab == 10 || bc == 10) {
            return 10;
        } else if (Math.abs(ac - bc) == 10 || Math.abs(ac - ab) == 10 || Math.abs(bc - ab) == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        int ad = a / 10;
        int ae = a % 10;
        int bd = b / 10;
        int be = b % 10;
        return (ad == be || ad == bd || ae == bd || ae == be);
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        int length = String.valueOf(a).length();
        int length1 = String.valueOf(sum).length();

        if (length == length1) {
            return sum;
        } else {

            return a;
        }
    }
}
