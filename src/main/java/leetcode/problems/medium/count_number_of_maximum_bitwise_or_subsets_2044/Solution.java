package leetcode.problems.medium.count_number_of_maximum_bitwise_or_subsets_2044;

public class Solution {
    //Very slow, 76ms, iterate over each subset using bitmask
    public int countMaxOrSubsets(int[] nums) {
        int nMaxOrSubsets = 0;
        int maxOr = nums[0];
        int[] bitMasks = new int[nums.length];
        bitMasks[0] = 1;
        for (int i = 1 ; i < nums.length; i++) {
            maxOr |= nums[i];
            bitMasks[i] = 1 << i;
        }
        for (int mask = 0; mask < (1 << nums.length); mask++) {
            int orOfSubset = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((mask & bitMasks[j]) != 0) {
                    if (orOfSubset == 0) {
                        orOfSubset = nums[j];
                    } else {
                        orOfSubset |= nums[j];
                    }
                    if (orOfSubset == maxOr) {
                        nMaxOrSubsets++;
                        break;
                    }
                }
            }
        }
        return nMaxOrSubsets;

    }
}
