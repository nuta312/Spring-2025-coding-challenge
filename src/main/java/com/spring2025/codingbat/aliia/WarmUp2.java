package com.spring2025.codingbat.aliia;

public class WarmUp2 {

    public String stringTimes(String str, int n) {
        String empty = "";

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                empty += str;
            }
        }
        return empty;
    }

    public String frontTimes(String str, int n) {
        String empty = "";
        for (int i = 1; i <= n; i++) {
            if (str.length() >= 3) {
                String sub = str.substring(0, 3);
                empty = empty + sub;
            } else {
                empty = empty + str;
            }
        }
        return empty;
    }

    int countXX(String str) {
        int count = 0;

        for (int i = 0; i <= str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.contains("xx")) {
                count += 1;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int indexStr = str.indexOf("x");

        if (str.length() > 1) {
            if (indexStr != str.length() - 1 && str.charAt(indexStr + 1) == 'x') {
                return true;
            }
        }
        return false;
    }

    public String stringBits(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 1; i += 2) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public String stringSplosion(String str) {
        String result = "";

        for (int i = 0; i <= str.length(); i++) {
            result = result + str.substring(0, i);
        }
        return result;
    }

    public int last2(String str) {
        int counter = 0;

        if (str.length() > 2) {
            String sub = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(sub)) {
                    counter += 1;
                }
            }
        }
        return counter;
    }

    public int arrayCount9(int[] nums) {
        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                counter += 1;
            }
        }

        return counter;
    }

    public boolean arrayFront9(int[] nums) {
        boolean result = false;

        if (nums.length > 0) {
            int i = 0;
            while (i <= nums.length - 1) {
                if (nums[i] == 9 && i <= 3) {
                    result = true;
                }
                i++;
            }
        }
        return result;
    }

    public boolean array123(int[] nums) {
        boolean result = false;
        int i = 0;

        while (i < nums.length - 2) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                result = true;
            }
            i++;
        }
        return result;
    }

    public int stringMatch(String a, String b) {
        int counter = 0;
        int i = 0;
        int j = 0;

        while (i < a.length() - 1 && j < b.length() - 1) {
            if (a.substring(i, i + 2).equals(b.substring(j, j + 2))) {
                counter += 1;
            }

            i++;
            j++;
        }
        return counter;
    }

    public String stringX(String str) {
        String result = "";
        int i = 0;
        int j = str.length();

        while (i < j) {
            if (i == 0 || i == j - 1) {
                result += str.charAt(i);
            } else if (!(str.charAt(i) == 'x')) {
                result += str.charAt(i);
            }

            i++;
        }
        return result;
    }

    public String altPairs(String str) {
        String result = "";

        if (str.length() >= 2) {
            result += "" + str.charAt(0) + str.charAt(1);

            for (int i = 4; i < str.length(); i += 4) {
                result += str.charAt(i);

                if (i + 1 < str.length()) {
                    result += str.charAt(i + 1);
                }
            }

        } else if (str.length() == 1) {
            result += str;
        }
        return result;
    }

    public String stringYak(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i = i + 2;
            } else {
                result += str.charAt(i);
            }
        }
        return result;
    }

    public int array667(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                result++;
            }
        }
        return result;
    }

    public boolean noTriples(int[] nums) {
        boolean result = true;
        int i = 0;

        while (i < nums.length - 2) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                result = false;
            }
            i++;
        }
        return result;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int num = nums[i];

            if (num + 5 == nums[i + 1] && (num - 3 <= nums[i + 2] && num + 1 >= nums[i + 2])) {
                return true;
            }
        }
        return false;
    }
}
