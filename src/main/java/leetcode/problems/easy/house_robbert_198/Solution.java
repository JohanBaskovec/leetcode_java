package leetcode.problems.easy.house_robbert_198;

public class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];
        // dp[i] is how much money you can rob by robbing i and the end of the street
        // dp[nums.length] = 0 (end of the street)
        dp[dp.length - 1] = nums[nums.length - 1];
        dp[dp.length - 2] = nums[nums.length - 2];

        for (int i = nums.length - 3; i >= 0; i--) {
            if (i + 3 < nums.length) {
                dp[i] = Math.max(dp[i + 2], dp[i + 3]) + nums[i];
            } else {
                dp[i] = dp[i + 2] + nums[i];
            }
        }
        return Math.max(dp[0], dp[1]);

    }
}
