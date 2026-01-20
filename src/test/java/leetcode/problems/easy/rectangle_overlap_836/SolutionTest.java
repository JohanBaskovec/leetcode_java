package leetcode.problems.easy.rectangle_overlap_836;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isRectangleOverlap() {
        Solution s = new Solution();
        assertTrue(s.isRectangleOverlap(new int[]{0,0,2,2}, new int[]{1,1,3,3}));
        assertFalse(s.isRectangleOverlap(new int[]{0,0,1,1}, new int[]{1,0,2,1}));
        assertFalse(s.isRectangleOverlap(new int[]{0,0,1,1}, new int[]{2,2,3,3}));
        assertTrue(s.isRectangleOverlap(new int[]{7,8,13,15}, new int[]{10,8,12,20}));
        assertTrue(s.isRectangleOverlap(new int[]{-930,154,-278,985}, new int[]{-912,362,-630,770}));
    }
}