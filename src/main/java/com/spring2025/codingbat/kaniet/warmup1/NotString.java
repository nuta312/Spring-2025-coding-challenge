package com.spring2025.codingbat.kaniet.warmup1;
/**
 * @author Kaniet
 */
public class NotString {

/*  Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
*/
public String notString(String str) {
    String notStr = "not ";
    if (str.contains(notStr)){
        return str;
    } else if (str.equals(notStr.trim())) {
        return str;
    }
    else {
        return notStr + str;
    }
}
}
