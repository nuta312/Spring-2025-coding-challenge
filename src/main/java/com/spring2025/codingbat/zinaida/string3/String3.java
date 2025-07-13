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

    /*
Given two strings, base and remove, return a version of the base string where all instances of the
remove string have been removed (not case sensitive). You may assume that the remove string is
length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
     */
    public String withoutString(String base, String remove) {

        StringBuilder result = new StringBuilder();
        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();

        int i = 0;
        while (i < base.length()) {
            if (i <= base.length() - remove.length() &&
                    baseLower.substring(i, i + remove.length()).equals(removeLower)) {
                i += remove.length();
            } else {
                result.append(base.charAt(i));
                i++;
            }
        }
        return result.toString();
    }

    /*
Given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number
of appearances of "not" anywhere in the string (case sensitive).

equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
     */
    public boolean equalIsNot(String str) {

        int countIs = 0;
        int counNot = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'i' && str.charAt(i + 1) == 's') {
                countIs++;
            }
            if (str.charAt(i) == 'n' && str.charAt(i + 1) == 'o' && str.charAt(i + 2) == 't') {
                counNot++;
            }
        }
        return countIs == counNot;
    }

    /*
We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its
left or right. Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
     */

    public boolean gHappy(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                boolean isHappy = false;
                if (i > 0 && str.charAt(i - 1) == 'g') isHappy = true;
                if (i < str.length() - 1 && str.charAt(i + 1) == 'g') isHappy = true;

                if (!isHappy) {
                    return false;
                }
            }
        }
        return true;
    }

}
