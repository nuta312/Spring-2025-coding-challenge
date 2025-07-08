package com.spring2025.codingbat.elviraI.array3;

public class Array3 {
    public int maxSpan(int[] nums) {
        int maxSpan = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j >= i; j--) {
                if (nums[i] == nums[j]) {
                    int span = j - i + 1;
                    if (span > maxSpan) {
                        maxSpan = span;
                    }
                    break; // Можно выйти из внутреннего цикла, как только нашли самое правое совпадение
                }
            }
        }

        return maxSpan;
    }

    public int[] fix34(int[] nums) {
        int n = nums.length;
        int fourIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 3) {
                // Ищем свободную четвёрку, пока не выйдем за границы
                while (fourIndex < n && (nums[fourIndex] != 4 || (fourIndex > 0 && nums[fourIndex - 1] == 3))) {
                    fourIndex++;
                }
                // Дополнительная проверка на границы
                if (fourIndex < n) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[fourIndex];
                    nums[fourIndex] = temp;
                }
            }
        }
        return nums;
    }

    public int[] fix45(int[] nums) {
        int n = nums.length;
        int fiveIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == 4) {
                // Ищем свободную четвёрку, пока не выйдем за границы
                while (fiveIndex < n && (nums[fiveIndex] != 5 ||
                        (fiveIndex > 0 && nums[fiveIndex - 1] == 4))) {
                    fiveIndex++;
                }
                // Дополнительная проверка на границы
                if (fiveIndex < n) {
                    int temp = nums[i + 1];
                    nums[i + 1] = nums[fiveIndex];
                    nums[fiveIndex] = temp;
                }
            }
        }
        return nums;
    }

    public boolean canBalance(int[] nums) {
        int total = 0;

        // Сначала считаем полную сумму массива
        for (int num : nums) {
            total += num;
        }

        int leftSum = 0;

        // Проверяем, можем ли разделить на две равные части
        for (int i = 0; i < nums.length; i++) {
            leftSum += nums[i];
            int rightSum = total - leftSum;

            if (leftSum == rightSum) {
                return true;
            }
        }

        return false;
    }

    public boolean linearIn(int[] outer, int[] inner) {
        int i = 0; // индекс для inner
        int j = 0; // индекс для outer

        while (i < inner.length && j < outer.length) {
            if (inner[i] == outer[j]) {
                i++; // нашли элемент inner — переходим к следующему
            } else if (outer[j] < inner[i]) {
                j++; // продолжаем искать
            } else {
                return false; // outer[j] > inner[i], значит элемента inner[i] в outer нет
            }
        }

        // если прошли весь inner — значит все его элементы есть в outer
        return i == inner.length;
    }

    public int[] squareUp(int n) {
        int[] result = new int[n * n];

        for (int i = 1; i <= n; i++) { // группы от 1 до n
            for (int j = 1; j <= i; j++) { // числа от i до 1
                int index = i * n - j;
                result[index] = j;
            }
        }

        return result;
    }

    public int[] seriesUp(int n) {
        int[] result = new int[n * (n + 1) / 2];
        int index = 0;

        for (int i = 1; i <= n; i++) { // группы от 1 до n
            for (int j = 1; j <= i; j++) { // числа от i до 1
                result[index] = j;
                index++;
            }
        }

        return result;
    }

    public int maxMirror(int[] nums) {
        int max = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                int length = 0;
                int ti = i;
                int tj = j;

                while (ti < n && tj >= 0 && nums[ti] == nums[tj]) {
                    length++;
                    ti++;
                    tj--;
                }

                max = Math.max(max, length);
            }
        }

        return max;
    }
}
