package leetcode.problems.easy.set_mismatch_645;


class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] found = new int[nums.length + 1];
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            found[nums[i]]++;
            if (found[nums[i]] == 2) {
                res[0] = nums[i];
            }
        }
        for  (int i = 1; i < found.length; i++) {
            if (found[i] == 0) {
                res[1] = i;
            }
        }
        return res;
    }
}
