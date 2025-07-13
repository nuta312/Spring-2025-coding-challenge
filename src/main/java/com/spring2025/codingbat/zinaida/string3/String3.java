package com.spring2025.codingbat.zinaida.string3;

/*
@author Zinaida
 */
public class String3 {

    /*
Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the
'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is
at the end of a word if there is not an alphabetic letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

countYZ("fez day") → 2
countYZ("day fez") → 2
countYZ("day fyyyz") → 2
     */
    public int countYZ(String str) {

        String str1 = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            char current = str1.charAt(i);

            if (current == 'y' || current == 'z') {
                if (i == str1.length() - 1 || !Character.isLetter(str1.charAt(i + 1))) {
                    count++;
                }
            }
        }
        return count;
    }

}
