package leetcode.problems.easy.longest_continuous_increasing_subsequence_674;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findLengthOfLCIS() {
        Solution s = new Solution();
        assertEquals(4, s.findLengthOfLCIS(new int[]{1, 2, 3, 4}));
        assertEquals(1, s.findLengthOfLCIS(new int[]{1, 0, 0, 0}));
        assertEquals(1, s.findLengthOfLCIS(new int[]{2,2,2,2}));
        assertEquals(3, s.findLengthOfLCIS(new int[]{2,1,2,2,3,4}));
    }
}