package leetcode.problems.easy.keep_multiplying_found_values_by_two_214;

public class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean[] hasNum = new boolean[1001];
        for (int num : nums) {
            if (original == num) {
                original *= 2;
            }
            hasNum[num] = true;
        }
        while (original < hasNum.length && hasNum[original]) {
            original *= 2;
        }
        return original;
    }
}
