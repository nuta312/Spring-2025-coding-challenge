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

    /*
We'll say that a "triple" in a string is a char appearing three times in a row. Return the number
of triples in the given string. The triples may overlap.

countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0
     */
    public int countTriple(String str) {

        int countTriple = 0;
        for (int i = 0; i < str.length() -2; i++){
            if (str.charAt(i) == str.charAt(i +1) && str.charAt(i) == str.charAt(i+2)){
                countTriple ++;
            }
        }
        return countTriple;
    }

    /*
Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests
if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)

sumDigits("aa1bc2d3") → 6
sumDigits("aa11b33") → 8
sumDigits("Chocolate") → 0
     */
    public int sumDigits(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))){
                String char1 = str.substring(i,i+1);
                count += Integer.parseInt(char1);
            }
        }
        return count;
    }

    /*
Given a string, return the longest substring that appears at both the beginning and end of the
string without overlapping. For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
     */
    public String sameEnds(String string) {

        int len = string.length()/2;
        for (int i = len; i >=0; i--){
            String start = string.substring(0, i);
            String end = string.substring(string.length() - i);

            if (start.equals(end)) return start;
        }
        return "";
    }
}
