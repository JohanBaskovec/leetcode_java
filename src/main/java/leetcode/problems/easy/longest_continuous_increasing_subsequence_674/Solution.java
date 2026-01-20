package leetcode.problems.easy.longest_continuous_increasing_subsequence_674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 0;
        int i = 1;
        int iStart = 0;
        while (i < nums.length) {
            if (nums[i] <= nums[i - 1]) {
                int length = i - iStart;
                if (length > maxLength) {
                    maxLength = length;
                }
                int n = nums[i];
                while (i + 1 < nums.length && nums[i + 1] == n) {
                    i++;
                }
                iStart = i;
            }
            i++;
        }
        int length = i - iStart;
        if (length > maxLength) {
            maxLength = length;
        }
        return maxLength;
    }
}
