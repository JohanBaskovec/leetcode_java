package leetcode.problems.easy.n_repeated_element_in_size_2n_array_961;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            }
            set.add(nums[i]);
        }

        return nums[0];
    }
/*
    Slow solution 3ms
    It's slow because initializing an empty array takes a long time

    public int repeatedNTimes(int[] nums) {
        int[] count = new int[100001];
        for (int num : nums) {
            if (count[num] == 1) {
                return num;
            }
            count[num]++;
        }
        return -1;
    }
*/
}
