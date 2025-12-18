package leetcode.problems.easy.arranging_coins_441;

public class Solution {
    public int arrangeCoins(int n) {
        return (int) Math.floor((-1 + Math.sqrt(1 + (8 * (long)n))) / 2.0);
    }
}
