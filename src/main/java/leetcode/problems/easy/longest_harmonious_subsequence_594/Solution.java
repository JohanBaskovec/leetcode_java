package leetcode.problems.easy.longest_harmonious_subsequence_594;

import java.util.Arrays;

public class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] == nums[nums.length - 1]) {
            return 0;
        } else if (nums[0] == nums[nums.length - 1] - 1) {
            return nums.length;
        }
        int lengthLongestSubsequence = 0;
        int i = 0;
        while (i < nums.length) {
            int j = i + 1;
            while (j < nums.length && nums[j] == nums[i]) {
                j++;
            }
            // j is the first number that's different
            if (j < nums.length && nums[j] == nums[i] + 1) {
                // if it's lowest + 1, then find the end of the subsequence
                // find the next number that's different
                int k = j+1;
                while (k < nums.length && nums[k] == nums[j]) {
                    k++;
                }
                // k is the next different number
                int length = k - i;
                if (length > lengthLongestSubsequence) {
                    lengthLongestSubsequence = length;
                }
            }

            // we move to the first number that's different
            i = j;
        }


        if (lengthLongestSubsequence == 1) {
            return 0;
        }
        return lengthLongestSubsequence;

    }
}
