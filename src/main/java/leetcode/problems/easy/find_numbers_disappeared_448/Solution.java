package leetcode.problems.easy.find_numbers_disappeared_448;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] contained = new boolean[nums.length + 1];
        for (int i = 0 ; i  < nums.length ; i++) {
            contained[nums[i]] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < contained.length; i++) {
            if (!contained[i]) {
                result.add(i);
            }
        }
        return result;
    }
}
