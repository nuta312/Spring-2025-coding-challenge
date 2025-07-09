package com.spring2025.codingbat.elviraI.logic2;

public class Logic2 {
    public boolean makeBricks(int small, int big, int goal) {
        int maxBigused=Math.min((goal/5), big);
        int remaining = goal -maxBigused*5;
        return (remaining<=small);
    }
    public int loneSum(int a, int b, int c) {
        int sum =a+b+c;
        if(a==b&& b==c){
            return 0;
        }else if(a==b){
            return c;
        }else if(a==c){
            return b;
        }else if(b==c){
            return a;
        }else {
            return sum;
        }
    }
    public int luckySum(int a, int b, int c) {
        int sum=0;
        if(a==13){
            sum=0;
        }else if(b==13){
            sum=a;
        }else if(c==13){
            sum=a+b;
        }else{
            sum=a+b+c;
        }
        return sum;
    }
    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a)+fixTeen(b)+fixTeen(c);

    }
    public int fixTeen(int n){
        if (n>=13 && n<=19&& n!=15&& n!=16){
            return 0;
        }
        return n;
    }
    public int roundSum(int a, int b, int c) {
        return round10(a)+round10(b)+round10(c);

    }
    public int round10(int num) {
        if (num%10>=5){
            return (num/10+1)*10;
        }
        return (num/10)*10;
    }
    public boolean closeFar(int a, int b, int c) {
        return ((Math.abs(a-b)<=1&&Math.abs(a-c)>=2&&Math.abs(b-c)>=2)
                ||(Math.abs(a-c)<=1&&Math.abs(a-b)>=2&&Math.abs(c-b)>=2));
    }
    public int blackjack(int a, int b) {
        if (a<=21 && b>21){
            return a;
        }else if(a>21 && b<=21){
            return b;
        }else if (a<=21&&b<=21&&a>b){
            return a;
        }else if (a<=21&&b<=21&&a<b){
            return b;
        }else{
            return 0;
        }
    }
    public boolean evenlySpaced(int a, int b, int c) {
        int max=Math.max (a,Math.max(b,c));
        int min=Math.min(a, Math.min(b,c));
        int mid=a+c+b-max-min;

        return (max-mid==mid-min);
    }
    public int makeChocolate(int small, int big, int goal) {
        int maxBigused=Math.min((goal/5), big);
        int remaining = goal -maxBigused*5;
        if (remaining<=small){
            return remaining;
        }
        return -1;


    }
}
