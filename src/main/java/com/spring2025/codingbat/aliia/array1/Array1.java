package com.spring2025.codingbat.aliia.array1;

public class Array1 {

    public boolean firstLast6(int[] nums) {
        if(nums[0] == 6 || nums[nums.length -1] == 6)
        {return true ;
        }else {
            return false;
        }
    }

    public boolean sameFirstLast(int[] nums) {
        if(nums.length > 1 && nums[0] == nums[nums.length -1]) {
            return true;
        }  else if(nums.length == 1) {
            return true;
        }
        return false;
    }

    public int[] makePi() {
        int[]arr = {3,1,4};
        return arr;
    }

    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) ? true: false ;
    }

    public int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }

    public int[] rotateLeft3(int[] nums) {
        if(nums.length == 3) {
            int n1 = nums[0];
            int n2 = nums[1];
            int n3 = nums[2];

            nums[0] = n2;
            nums[1] = n3;
            nums[2] = n1;
        }
        return nums;
    }

    public int[] reverse3(int[] nums) {
        if(nums.length == 3) {
            int n1 = nums[0];
            int n3 = nums[2];

            nums[0] = n3;
            nums[2] = n1;
        }
        return nums;
    }

    public int[] maxEnd3(int[] nums) {
        if(nums.length == 3) {
            if(nums[0] > nums[2]) {
                nums[1] = nums[0];
                nums[2] = nums[0];
            } else {
                nums[0] = nums[2];
                nums[1] = nums[2];
            }
        }
        return nums;
    }

    public int sum2(int[] nums) {
        int sum = 0;
        if(nums.length == 1) {
            sum = nums[0];
        } else if(nums.length > 1) {
            sum = nums[0] + nums[1];
        }
        return sum;
    }

    public int[] middleWay(int[] a, int[] b) {
        int[] nums = new int[2];

        nums[0] = a[1];
        nums[1] = b[1];

        return nums;
    }

    public int[] makeEnds(int[] nums) {
        int []nums2 = new int[2];
        nums2[0] = nums[0];
        nums2[1] = nums[nums.length - 1];

        return nums2;
    }

    public boolean has23(int[] nums) {
        boolean result = false;

        for(int num : nums) {
            if(num == 2 || num == 3) {
                result = true;
            }
        }
        return result;
    }

    public boolean no23(int[] nums) {
        boolean result = true;

        for(int num : nums) {
            if(num == 2 || num == 3) {
                result = false;
            }
        }
        return result;
    }

    public int[] makeLast(int[] nums) {
        int n = nums[nums.length - 1];
        int []nums1 = new int[nums.length * 2];
        nums1[nums.length * 2 - 1] = n;

        return nums1;
    }

    public boolean double23(int[] nums) {
        boolean result = false;

        if(nums.length == 2) {
            if ((nums[0] == nums[1]) && (nums[0] == 2 || nums[0] == 3)) {
                result = true;
            }
        }
        return result;
    }

    public int[] fix23(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if( nums[i - 1] == 2 && nums[i] == 3) {
                nums[i] = 0;
            }
        }
        return nums;
    }

    public int start1(int[] a, int[] b) {
        int count = 0;

        if(a.length >= 1 && b.length >= 1) {
            if (a[0] == 1) {
                count++;
            }

            if (b[0] == 1) {
                count++;
            }
        } else if (a.length >= 1 && b.length < 1) {
            if(a[0] ==1) {
                count++;
            }
        } else if (b.length >= 1 && a.length < 1) {
            if(b[0] ==1) {
                count++;
            }
        }
        return count;
    }

    public int[] biggerTwo(int[] a, int[] b) {
        int sum1 = a[0] + a[1];
        int sum2 = b[0] + b[1];
        if(sum1 > sum2){
            return a;
        } else if (sum1 == sum2) {
            return a;
        } else {
            return b;
        }
    }

    public int[] makeMiddle(int[] nums) {

        int [] nums1 = new int[2];

        if(nums.length > 2) {
            nums1[0] = nums[nums.length/2 - 1];
            nums1[1] = nums[nums.length/2];
            return nums1;
        }

        return nums;
    }

    public int[] plusTwo(int[] a, int[] b) {
        int [] nums = new int[ a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            nums[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            nums[a.length + i] = b[i];
        }

        return nums;
    }

    public int[] swapEnds(int[] nums) {
        if(nums.length >=2 ) {
            int n = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = n;
        }

        return nums;
    }

    public int[] midThree(int[] nums) {
        int []result = new int[3];

        result[0] = nums[nums.length / 2 - 1];
        result[1] = nums[nums.length / 2];
        result[2] = nums[nums.length / 2 + 1];

        return result;
    }

    public int maxTriple(int[] nums) {
        int max = nums[0];

        if(max < nums[nums.length/2] && nums[nums.length/2] > nums[nums.length - 1]) {
            max = nums[nums.length/2];
        } else if(nums[nums.length/2] < nums[nums.length - 1] && nums[nums.length - 1] > max) {
            max = nums[nums.length - 1];
        }

        return max;
    }

    public int[] frontPiece(int[] nums) {
        if(nums.length <= 1) return nums;

        return new int[]{nums[0], nums[1]};
    }

    public boolean unlucky1(int[] nums) {
        boolean result = false;

        for(int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3 && (i <= 1 || i >= nums.length - 2)) {
                result = true;
            }
        }
        return result;
    }

    public int[] make2(int[] a, int[] b) {
        int []nums = new int[2];

        if(a.length >= 2) {
            nums[0] = a[0];
            nums[1] = a[1];
        }  else if(a.length == 1 && b.length > 1){
            nums[0] = a[0];
            nums[1] = b[0];
        } else if (b.length >= 2 ) {
            nums[0] = b[0];
            nums[1] = b[1];
        } else if(a.length == 1 && b.length == 1) {
            nums[0] = a[0];
            nums[1] = b[0];
        }

        return nums;
    }

    public int[] front11(int[] a, int[] b) {
        if(a.length >= 1 && b.length == 0) {
            return new int[]{a[0]};
        } else if(a.length == 0 && b.length > 1) {
            return new int[]{b[0]};
        } else if(a.length == 0 && b.length == 0) {
            return a;
        }

        int nums[] = new int[]{a[0], b[0]};

        return nums;
    }
}
