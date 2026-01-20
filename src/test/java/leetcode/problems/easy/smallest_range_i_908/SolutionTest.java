package leetcode.problems.easy.smallest_range_i_908;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void smallestRangeI() {
        Solution s = new Solution();
        assertEquals(0, s.smallestRangeI(new int[]{1}, 0));
        assertEquals(6, s.smallestRangeI(new int[]{0, 10}, 2));
        assertEquals(0, s.smallestRangeI(new int[]{1, 3, 6}, 3));
        assertEquals(12, s.smallestRangeI(new int[]{0,3,6,8,10,12,16,24}, 6));
        assertEquals(3, s.smallestRangeI(new int[]{10,7,1}, 3));
    }
}