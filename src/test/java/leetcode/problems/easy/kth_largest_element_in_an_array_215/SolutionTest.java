package leetcode.problems.easy.kth_largest_element_in_an_array_215;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findKthLargest() {
        Solution s = new Solution();
        assertEquals(5, s.findKthLargest(new int[]{3,2,1,5,6,4}, 2));
        assertEquals(4, s.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
        assertEquals(1, s.findKthLargest(new int[]{2,1}, 2));
    }
}