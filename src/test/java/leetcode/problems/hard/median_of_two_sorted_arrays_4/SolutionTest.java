package leetcode.problems.hard.median_of_two_sorted_arrays_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void findMedianSortedArrays() {
        Solution solution = new Solution();
        int[] nums0 = new int[]{1,3};
        int[] nums1 = new int[]{2};
        assertEquals(2.0, solution.findMedianSortedArrays(nums0, nums1));

        assertEquals(2.5, solution.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
        assertEquals(1.5, solution.findMedianSortedArrays(new int[]{1}, new int[]{2}));
        assertEquals(1, solution.findMedianSortedArrays(new int[]{1}, new int[]{}));
        assertEquals(9.0, solution.findMedianSortedArrays(new int[]{1,2,3,4,5}, new int[]{6,7,8,9,10,11,12,13,14,15,16,17}));
    }
}