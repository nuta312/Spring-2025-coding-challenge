package com.spring2025.codingbat.logic1;

public class Logic1 {
    public static void main(String[] args) {

    }

    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend) return cigars >= 40;
        return cigars >= 40 && cigars <= 60;
    }

    public int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        } else {
            return 1;
        }
    }

    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            return temp >= 60 && temp <= 100;
        } else {
            return temp >= 60 && temp <= 90;
        }
    }

    public int caughtSpeeding(int speed, boolean isBirthday) {
        int upperSpeed = isBirthday ? 5 : 0;
        if (speed <= 60 + upperSpeed) {
            return 0;
        } else if (speed <= 80 + upperSpeed) {
            return 1;
        } else {
            return 2;
        }
    }

    public int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    public String alarmClock(int day, boolean vacation) {
        if (vacation) {
            if (day == 0 || day == 6) {
                return "off";
            } else {
                return "10:00";
            }
        } else {
            if (day == 0 || day == 6) {
                return "10:00";
            } else {
                return "7:00";
            }
        }
    }

    public boolean love6(int a, int b) {
        return (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6);
    }

    public boolean in1To10(int n, boolean outsideMode) {
        if (outsideMode) {
            return n <= 1 || n >= 10;
        } else {
            return n >= 1 && n <= 10;
        }
    }

    public boolean specialEleven(int n) {
        return n % 11 == 0 || n % 11 == 1;
    }

    public boolean more20(int n) {
        return n % 20 == 1 || n % 20 == 2;
    }

    public boolean old35(int n) {
        return (n % 3 == 0 || n % 5 == 0) && (n % 3 != 0 || n % 5 != 0);
    }

    public boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    public boolean nearTen(int num) {
        return num % 10 >= 8 || num % 10 <= 2;
    }

    public int teenSum(int a, int b) {
        int sum = a + b;
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            return sum;
        }
    }

    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning) {
            if (isMom) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        } else if (tea >= 2 * candy || candy >= 2 * tea) {
            return 2;
        } else {
            return 1;
        }
    }

    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else {
            return str;
        }
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
        if (a + b == c || b + c == a || a + c == b) {
            return true;
        } else {
            return false;
        }
    }

    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) {
            return c > b;
        } else {
            return b > a && c > b;
        }
    }

    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) {
            return a <= b && b <= c;
        } else {
            return a < b && b < c;
        }
    }

    public boolean lastDigit(int a, int b, int c) {
        int aDigit = a % 10;
        int bDigit = b % 10;
        int cDigit = c % 10;

        return (aDigit == bDigit) || (aDigit == cDigit) || (bDigit == cDigit);
    }

    public boolean lessBy10(int a, int b, int c) {
        return (Math.abs(a - b) >= 10 ||
                Math.abs(a - c) >= 10 ||
                Math.abs(b - c) >= 10);
    }

    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2) {
            if (die1 == 6) {
                die1 = 1;
            } else {
                die1 = die1 + 1;
            }
        }
        return die1 + die2;
    }

    public int maxMod5(int a, int b) {
        if (a == b) {
            return 0;

        }
        if (a % 5 == b % 5) {
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }

    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }
        if (a == b && a == c && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        } else {
            return 0;
        }
    }

    public int greenTicket(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return 0;
        }
        if (a == b && a == c && b == c) {
            return 20;
        } else {
            return 10;
        }
    }

    public int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab == bc + 10 || ab == ac + 10) {
            return 5;
        } else {
            return 0;
        }
    }

    public boolean shareDigit(int a, int b) {
        int aL = a / 10;
        int aR = a % 10;
        int bL = b / 10;
        int bR = b % 10;

        return (aL == bL || aL == bR || aR == bL || aR == bR);
    }

    public int sumLimit(int a, int b) {
        int sum = a + b;
        if (String.valueOf(sum).length() == String.valueOf(a).length()) {
            return sum;
        }
        return a;
    }
}