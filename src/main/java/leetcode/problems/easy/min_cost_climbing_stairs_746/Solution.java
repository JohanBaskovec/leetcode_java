package leetcode.problems.easy.min_cost_climbing_stairs_746;

public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // dp[i] = cost to climb to the top from stair i
        int[] dp = new int[cost.length];
        // dp[cost.length] = 0 (top of the staircase)
        dp[dp.length - 1] = cost[cost.length - 1];
        dp[dp.length - 2] = cost[cost.length - 2];

        int totalCost = 0;
        for (int i = cost.length - 3; i >= 0; i--) {
            dp[i] = Math.min(dp[i + 1], dp[i + 2]) + cost[i];
        }
        return Math.min(dp[0], dp[1]);
    }
}
