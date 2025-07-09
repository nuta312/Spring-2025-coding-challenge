package com.spring2025.codingbat.aliia.logic2;

/**
 * @author aliyaalymbekova
 */

public class Logic2 {

    /*
    We want to make a row of bricks that is goal inches long.
    We have a number of small bricks (1 inch each) and big bricks (5 inches each).
    Return true if it is possible to make the goal by choosing from the given bricks.
    This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
     */

    public boolean makeBricks(int small, int big, int goal) {
        int kolBig = goal / 5;
        int ostatok = goal % 5;
        int s = (small * 1) + (big * 5);
        if( s < goal) {
            return false;
        } else {
            if (kolBig == big || ostatok <= small) {
                return  true;
            } else {
                return  false;
            }
        }
    }

}
