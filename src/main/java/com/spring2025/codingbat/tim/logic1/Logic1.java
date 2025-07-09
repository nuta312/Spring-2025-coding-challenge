package com.spring2025.codingbat.tim.logic1;

public class Logic1 {
    public static void main(String[] args) {
        Logic1 l = new Logic1();
        System.out.println(l.cigarParty(12, true));
    }
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if(isWeekend){
            if(cigars>=40){
                return true;
            }
        }
        if(cigars>=40 && cigars<=60){
            return true;
        }
        return false;
    }
    public int dateFashion(int you, int date) {
        int result = 0;
        if(you<=2 || date<=2){
            return result = 0;
        }
        if(you >=8 || date >=8){
            return result = 2;
        }

        return result = 1;
    }

}
