package leetcode.problems.easy.last_stone_weight_1046;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lastStoneWeight() {
        Solution s = new Solution();
        assertEquals(1, s.lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}