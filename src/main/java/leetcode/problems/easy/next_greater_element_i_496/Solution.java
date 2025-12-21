package leetcode.problems.easy.next_greater_element_i_496;

public class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] nextGreater = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    boolean found = false;
                    for (int k = j + 1; k < nums2.length; k++) {
                        if (nums2[k] > nums2[j]) {
                            nextGreater[i] = nums2[k];
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        nextGreater[i] = -1;
                    }
                    break;
                }
            }
        }
        return nextGreater;
    }
}
