package leetcode.problems.easy.largest_number_at_least_twice_of_others_747;

class Solution {
    public int dominantIndex(int[] nums) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int indexFirstMax = 0;
        if (nums[0] >= nums[1]) {
            firstMax = nums[0];
            secondMax = nums[1];
        } else {
            firstMax = nums[1];
            indexFirstMax = 1;
            secondMax = nums[0];
        }

        for (int i = 2 ; i < nums.length ; i++) {
            if (nums[i] > firstMax) {
                int copy = firstMax;
                firstMax = nums[i];
                indexFirstMax = i;
                secondMax = copy;
            } else if (nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return firstMax >= secondMax * 2 ? indexFirstMax : -1;
    }
}
