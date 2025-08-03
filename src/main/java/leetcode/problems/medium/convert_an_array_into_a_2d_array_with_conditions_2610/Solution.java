package leetcode.problems.medium.convert_an_array_into_a_2d_array_with_conditions_2610;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        int[] numberFrequencies = new int[nums.length + 1];
        int highestFrequency = 0;
        for (int num : nums) {
            int currentFreq = numberFrequencies[num];
            int newFreq = currentFreq + 1;
            if (newFreq > highestFrequency) {
                highestFrequency = newFreq;
            }
            numberFrequencies[num] = newFreq;
        }
        List<Integer>[] numbersByFrequency = new List[highestFrequency + 1];
        for (int number = 0; number < numberFrequencies.length; number++) {
            int frequency = numberFrequencies[number];
            List<Integer> numbersWithSameFreq = numbersByFrequency[frequency];
            if (numbersWithSameFreq == null) {
                numbersWithSameFreq = new ArrayList<>();
                numbersByFrequency[frequency] = numbersWithSameFreq;
            }
            numbersWithSameFreq.add(number);
        }
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 1 ; i <= highestFrequency ; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = i ; j <= highestFrequency ; j++) {
                List<Integer> numbersWithFreq = numbersByFrequency[j];
                if (numbersWithFreq != null) {
                    row.addAll(numbersWithFreq);
                }
            }
            res.add(row);
        }
        return res;
    }
}
