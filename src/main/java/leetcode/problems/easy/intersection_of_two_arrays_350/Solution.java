package leetcode.problems.easy.intersection_of_two_arrays_350;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] count =  new int[1001];
        for (int num : nums1) {
            count[num]++;
        }
        ArrayList<Integer> ret = new ArrayList<>();
        for (int num : nums2) {
            if (count[num]-- > 0) {
                ret.add(num);
            }
        }
        return ret.stream().mapToInt(k -> k).toArray();
    }

    public int[] intersectSlow(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        ArrayList<Integer> ret = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                ret.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            }
        }
        return ret.stream().mapToInt(k -> k).toArray();
    }
}
