package leetcode.problems.easy.degree_of_an_array_697;

import java.util.Arrays;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int[] first = new int[50000];
        int[] last = new int[50000];
        int[] freq = new int[50000];
        first[nums[0]] = 0;
        last[nums[0]] = 0;
        freq[nums[0]] = 1;
        int maxFreq = 1;
        int shortedSubArray = nums.length;
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num != nums[0] && first[num] == 0) {
                first[num] = i;
                last[num] = i;
            } else {
                last[num] = i;
            }
            freq[num]++;
            if (freq[num] > maxFreq) {
                maxFreq = freq[num];
            }
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxFreq) {
                int length = last[i] - first[i] + 1;
                if (length < shortedSubArray) {
                    shortedSubArray = length;
                }
            }
        }
        return shortedSubArray;
    }
}
