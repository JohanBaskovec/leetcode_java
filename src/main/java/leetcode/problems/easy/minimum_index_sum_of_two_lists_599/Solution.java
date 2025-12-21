package leetcode.problems.easy.minimum_index_sum_of_two_lists_599;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    /* Fast solution, 6ms on LeetCode, beats 99% */
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> distances = new HashMap<>();
        List<String> res = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            distances.put(list1[i], i);
        }
        for (int j = 0; j <= minSum && j < list2.length; j++) {
            Integer distance = distances.get(list2[j]);
            if (distance != null) {
                int newMinSum = distance + j;
                if (minSum > newMinSum) {
                    minSum = newMinSum;
                    res.clear();
                    res.add(list2[j]);
                } else if (minSum == newMinSum) {
                    res.add(list2[j]);
                }
            }

        }
        return res.toArray(new String[0]);
    }
    /* Slow solution, 42ms on LeetCode */
    public String[] findRestaurantSlow(String[] list1, String[] list2) {
        List<String> res = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length && j + i <= minSum; j++) {
                if (list1[i].equals(list2[j])) {
                    int newMinSum = j + i;
                    if (minSum > newMinSum) {
                        minSum = newMinSum;
                        res.clear();
                    }
                    res.add(list1[i]);

                }
            }
        }
        return res.toArray(new String[0]);
    }
}
