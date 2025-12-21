package leetcode.problems.easy.degree_of_an_array_697;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void findShortestSubArray() {
        Solution s = new Solution();
        assertEquals(2, s.findShortestSubArray(new int[]{1,2,2,3,1}));
        assertEquals(6, s.findShortestSubArray(new int[]{1,2,2,3,1,4,2}));
        assertEquals(2, s.findShortestSubArray(new int[]{1,1}));
    }

}