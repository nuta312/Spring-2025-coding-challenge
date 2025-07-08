package com.spring2025.codingbat.warmup2;

public class Warmup2 {
    public static void main(String[] args) {

    }

    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(str);
        }
        return result.toString();
    }

    public String frontTimes(String str, int n) {
        int len = 3;
        if (len > str.length()) {
            len = str.length();
        }
        String front = str.substring(0, len);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + front;
        }
        return result;
    }

    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }
        return count;
    }

    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;
        String x = str.substring(i);
        return x.startsWith("xx");
    }

    public String stringBits(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String stringSplosion(String str) {
        StringBuilder sb1 = new StringBuilder();

        for (int i = 1; i <= str.length(); i++) {
            sb1.append(str.substring(0, i));
        }
        return sb1.toString();
    }

    public int last2(String str) {
        if (str.length() < 2) return 0;

        String last = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(last)) {
                count++;
            }
        }
        return count;
    }

    public int arrayCount9(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public boolean arrayFront9(int[] nums) {
        int limit = 4;
        if (nums.length < 4) {
            limit = nums.length;
        }

        for (int i = 0; i < limit; i++) {
            if (nums[i] == 9) return true;
        }
        return false;
    }

    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) return true;
        }
        return false;
    }

    public int stringMatch(String a, String b) {
        int count = 0;
        int minlength = Math.min(a.length(), b.length());

        for (int i = 0; i < minlength - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }
        return count;
    }

    public String stringX(String str) {
        if (str.length() <= 2) {
            return str;
        }
        String start = str.substring(0, 1);
        String middle = str.substring(1, str.length() - 1).replace("x", "");
        String end = str.substring(str.length() - 1);

        return start + middle + end;
    }

    public String altPairs(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i += 4) {
            result += str.charAt(i);
            if (i + 1 < str.length()) {
                result += str.charAt(i + 1);
            }
        }
        return result;
    }

    public String stringYak(String str) {
        String result = "";
        for (int i = 0; i < str.length(); ) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 3;
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        return result;
    }

    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && nums[i + 1] == 6 || nums[i + 1] == 7) {
                count++;
            }
        }
        return count;
    }

    public boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] == nums[i + 1] && nums[i + 1] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == val + 5 &&
                    Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

}