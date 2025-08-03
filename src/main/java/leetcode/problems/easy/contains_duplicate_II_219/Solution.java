package leetcode.problems.easy.contains_duplicate_II_219;

import java.util.HashMap;

public class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> numbersEncountered = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            Integer lastIndex = numbersEncountered.get(nums[i]);
            if (lastIndex != null) {
                if (i - lastIndex <= k) {
                    return true;
                }
            }
            numbersEncountered.put(nums[i], i);
        }
        return false;
    }
}
