package leetcode.problems.easy.third_distinct_maximum_414;

import java.util.Arrays;

public class Solution {
    /* 1ms, use booleans to keep track of found values instead of Integer
    * (it's faster because there's no autoboxing) */
    public int thirdMax(int[] nums) {
        boolean maxIsNull = true;
        boolean secondMaxIsNull = true;
        boolean thirdMaxIsNull = true;
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int num : nums) {
            if (maxIsNull || num > max) {
                thirdMax = secondMax;
                if (!secondMaxIsNull) {
                    thirdMaxIsNull = false;
                }
                secondMax = max;
                if (!maxIsNull) {
                    secondMaxIsNull = false;
                }
                max = num;
                maxIsNull = false;
            } else if ((secondMaxIsNull || num > secondMax) && num != max) {
                thirdMax = secondMax;
                if (!secondMaxIsNull) {
                    thirdMaxIsNull = false;
                }
                secondMax = num;
                secondMaxIsNull = false;
            } else if (!secondMaxIsNull && (thirdMaxIsNull || num > thirdMax) && num != secondMax && num != max) {
                thirdMax = num;
                thirdMaxIsNull = false;
            }
        }
        if (thirdMaxIsNull) {
            return max;
        }
        return thirdMax;
    }
    /* 2ms */
    public int thirdMaxBoxing(int[] nums) {
        Integer max = null;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (int num : nums) {
            if (max == null || num > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = num;
            } else if ((secondMax == null || num > secondMax) && num != max) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (secondMax != null && (thirdMax == null || num > thirdMax) && num != secondMax && num != max) {
                thirdMax = num;
            }
        }
        if (thirdMax == null) {
            return max;
        }
        return thirdMax;
    }

    /* Slow solution, 9ms */
    public int thirdMaxSlow(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        int foundNums = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            int num = nums[i];
            if (num != nums[i + 1]) {
                foundNums++;
                if (foundNums == 3) {
                    return num;
                }
            }
        }
        return nums[nums.length - 1];
    }
}
