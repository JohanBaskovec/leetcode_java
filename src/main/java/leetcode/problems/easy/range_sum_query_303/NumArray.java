package leetcode.problems.easy.range_sum_query_303;

public class NumArray {
    private final int[] nums;
    private final int[] prefix;

    public NumArray(int[] nums) {
        this.nums = nums;
        this.prefix = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return prefix[right + 1] - prefix[left];
    }
}
