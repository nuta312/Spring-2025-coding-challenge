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
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if(isSummer){
            if(temp>=60 && temp<=100){
                return true;
            }else{
                return false;
            }
        }
        if(temp>=60 && temp<=90){
            return true;
        }else{
            return false;
        }
    }
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if(isBirthday){
            if(speed<66){
                return 0;
            }else if(speed>=66 && speed<=85){
                return 1;
            }else{
                return 2;
            }
        }
        if(speed<61){
            return 0;
        }else if(speed>=61 && speed<=80){
            return 1;
        }else{
            return 2;
        }
    }

}
