package leetcode.problems.medium.three_sum_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // we need at least one non-positive number so that the sum can be 0
            // nums[i] is that negative number, while nums[j] and nums[k] can be negative or positive
            if (nums[i] > 0) {
                break;
            }
            // result must not contain duplicate triplets, so we skip identical ones
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = nums.length - 1;
            int sum;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                // the array is sorted, therefor nums[j] is always less than nums[k]
                // so we know that if sum > 0, nums[k] is too high, and if sum < 0, nums[j] is too low
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    result.add(List.of(nums[i], nums[j], nums[k]));
                    // result must not contain duplicate triplets, so we skip identical ones
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }

            }


        }
        return result;
    }
}
