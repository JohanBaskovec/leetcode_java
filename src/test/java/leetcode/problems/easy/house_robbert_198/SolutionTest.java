package leetcode.problems.easy.house_robbert_198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rob() {
        Solution s = new Solution();
        assertEquals(4, s.rob(new int[]{1,2,3,1}));
        assertEquals(12, s.rob(new int[]{2,7,9,3,1}));
    }
}