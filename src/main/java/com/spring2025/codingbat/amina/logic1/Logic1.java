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
}
