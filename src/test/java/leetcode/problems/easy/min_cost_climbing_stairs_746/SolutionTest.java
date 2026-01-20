package leetcode.problems.easy.min_cost_climbing_stairs_746;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minCostClimbingStairs() {
        Solution solution = new Solution();
        assertEquals(15, solution.minCostClimbingStairs(new int[]{10,15,20}));
        assertEquals(6, solution.minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }
}