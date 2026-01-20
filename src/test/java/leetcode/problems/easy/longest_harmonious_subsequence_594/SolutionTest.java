package leetcode.problems.easy.longest_harmonious_subsequence_594;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findLHS() {
        Solution s = new Solution();
        assertEquals(5, s.findLHS(new int[]{1,3,2,2,5,2,3,7}));
        assertEquals(2, s.findLHS(new int[]{1,2,3,4}));
        assertEquals(0, s.findLHS(new int[]{1,1,1,1,1}));
        assertEquals(0, s.findLHS(new int[]{1,3,5,7,9,11,13,15,17}));
        assertEquals(3, s.findLHS(new int[]{1,1,1,1,1,1,3,5,5,6}));
        assertEquals(6, s.findLHS(new int[]{1,2,2,1,1,1}));
    }
}