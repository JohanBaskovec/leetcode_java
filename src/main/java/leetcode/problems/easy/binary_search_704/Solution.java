package leetcode.problems.easy.binary_search_704;

import java.util.Arrays;

public class Solution {
    public int search(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            return -1;
        }
        return index;
    }
}
