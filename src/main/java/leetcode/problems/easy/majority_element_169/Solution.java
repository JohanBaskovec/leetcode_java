package leetcode.problems.easy.majority_element_169;

import java.util.HashMap;

class Solution {
    /* Fast solution that uses the Boyer–Moore majority vote algorithm */
    public int majorityElement(int[] nums) {
        int currentElement = nums[0];
        int count = 0;
        for (int element : nums) {
            if (count == 0) {
                currentElement = element;
                count++;
            } else if (currentElement == element) {
                count++;
            } else {
                count--;
            }
        }
        return currentElement;
    }

    /* Slow solution that uses a HashMap to count each element */
    @SuppressWarnings("unused")
    public int majorityElementSlow(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int half = nums.length/2;
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int num : nums) {
            int count = counts.getOrDefault(num, 0) + 1;
            if (count > half) {
                return num;
            }
            counts.put(num, count);

        }
        return 0;
    }
}
