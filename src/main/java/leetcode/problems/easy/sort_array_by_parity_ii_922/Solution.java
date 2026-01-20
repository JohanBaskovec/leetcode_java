package leetcode.problems.easy.sort_array_by_parity_ii_922;

public class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int iOdd = 1;
        int iEven = 0;
        while (iEven < nums.length) {
            if (nums[iEven] % 2 != 0) {
                while (iOdd < nums.length) {
                    if (nums[iOdd] % 2 != 1) {
                        int copy = nums[iEven];
                        nums[iEven] = nums[iOdd];
                        nums[iOdd] = copy;
                        break;
                    }
                    iOdd+=2;
                }
            }
            iEven += 2;
        }

        return nums;
    }
}
