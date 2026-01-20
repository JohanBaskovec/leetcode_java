package leetcode.problems.easy.find_pivot_index_724;

public class Solution {
    public int pivotIndex(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;
        int iPivot = 0;

        for (int i = 1; i < nums.length; i++) {
            sumRight += nums[i];
        }
        if (sumLeft == sumRight) {
            return iPivot;
        }
        iPivot = 1;

        for (; iPivot < nums.length; iPivot++) {
            sumLeft += nums[iPivot - 1];
            sumRight -= nums[iPivot];
            if (sumLeft == sumRight) {
                return iPivot;
            }
        }
        return -1;
    }
}
