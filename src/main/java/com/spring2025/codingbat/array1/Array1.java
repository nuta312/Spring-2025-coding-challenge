package com.spring2025.codingbat.array1;

public class Array1 {
    public static void main(String[] args) {

    }

    public boolean firstLast6(int[] nums) {
        return nums[0] == 6 || nums[nums.length - 1] == 6;
    }

    public boolean sameFirstLast(int[] nums) {
        return nums.length >= 1 && nums[0] == nums[nums.length - 1];
    }

    public int[] makePi() {
        return new int[]{3, 1, 4};
    }

    public boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

    public int sum3(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

    public int[] rotateLeft3(int[] nums) {
        return new int[]{nums[1], nums[2], nums[0]};
    }

    public int[] reverse3(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        int max = Math.max(nums[0], nums[2]);
        nums[0] = nums[1] = nums[2] = max;
        return nums;
    }

    public int sum2(int[] nums) {
        int result = 0;
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums.length > 1) {
                result = nums[0] + nums[1];
            } else if (nums.length <= 1) {

                return nums[i];
            }
        }
        return result;
    }

    public int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }

    public int[] makeEnds(int[] nums) {
        return new int[]{nums[0], nums[nums.length - 1]};
    }

    public boolean has23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean no23(int[] nums) {
        for (int num : nums) {
            if (num == 2 || num == 3) {
                return false;
            }
        }
        return true;
    }

    public int[] makeLast(int[] nums) {
        int res[] = new int[nums.length * 2];
        res[res.length - 1] = nums[nums.length - 1];
        return res;
    }

    public boolean double23(int[] nums) {
        if (nums.length > 1) {
            return nums[0] == 2 && nums[1] == 2 || nums[0] == 3 && nums[1] == 3;
        }
        return false;
    }

    public int[] fix23(int[] nums) {
        if (nums[0] == 2 && nums[1] == 3) {
            nums[1] = 0;
        }
        if (nums[1] == 2 && nums[2] == 3) {
            nums[2] = 0;
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;

        for (int j : a) {
            if (j == 1) {
                count++;
            }
        }

        for (int j : b) {
            if (j == 1) {
                count++;
            }
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        return (sumA >= sumB) ? a : b;

    }

    public int[] makeMiddle(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid]};
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[4];

        result[0] = a[0];
        result[1] = a[1];


        result[2] = b[0];
        result[3] = b[1];

        return result;
    }

    public int[] swapEnds(int[] nums) {
        int temp = nums[0];
        nums[0] = nums[nums.length - 1];
        nums[nums.length - 1] = temp;
        return nums;
    }

    public int[] midThree(int[] nums) {
        int mid = nums.length / 2;
        return new int[]{nums[mid - 1], nums[mid], nums[mid + 1]};
    }

    public int maxTriple(int[] nums) {
        int firstArr = nums[0];
        int middleArr = nums[nums.length / 2];
        int lastArr = nums[nums.length - 1];

        return Math.max(firstArr, Math.max(lastArr, middleArr));
    }

    public int[] frontPiece(int[] nums) {
        if (nums.length >= 2) {
            return new int[]{nums[0], nums[1]};
        }
        if (nums.length == 1) {
            return new int[]{nums[0]};
        } else {
            return new int[]{};
        }
    }

    public boolean unlucky1(int[] nums) {
        int len = nums.length;

        if (len >= 2) {
            if (nums[0] == 1 && nums[1] == 3 || (nums[1] == 1 && nums[2] == 3)) {
                return true;
            }
            if (nums[len - 2] == 1 && nums[len - 1] == 3) {
                return true;
            }
        }
        return false;
    }

    public int[] make2(int[] a, int[] b) {
        int res[] = new int[2];
        int count = 0;

        for (int i = 0; i < a.length && count < 2; i++) {
            res[count] = a[i];
            count++;
        }

        for (int i = 0; i < b.length && count < 2; i++) {
            res[count] = b[i];
            count++;
        }
        return res;
    }

    public int[] front11(int[] a, int[] b) {
        if (a.length >= 1 && b.length >= 1) {
            return new int[]{a[0], b[0]};
        } else if (a.length >= 1) {
            return new int[]{a[0]};
        } else if (b.length >= 1) {
            return new int[]{b[0]};
        } else {
            return new int[]{};
        }
    }


}