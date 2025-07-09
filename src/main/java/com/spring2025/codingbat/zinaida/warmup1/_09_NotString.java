package com.spring2025.codingbat.zinaida.warmup1;

/*
@author Zinaida
 */
public class _09_NotString {

    /*
    Дана строка. Верните новую строку, в которую в начале добавлена подстрока "not ".
    Но если строка уже начинается с "not", верните её без изменений.
    Примечание: для сравнения строк используйте метод .equals().

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
    */
    public String notString(String str) {

        if (str.startsWith("not")) {
            return str;
        } else {
            return "not " + str;
        }
    }
}
