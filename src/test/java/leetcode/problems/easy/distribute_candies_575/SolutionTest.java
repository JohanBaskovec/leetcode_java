package leetcode.problems.easy.distribute_candies_575;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void distributeCandies() {
        Solution solution = new Solution();
        assertEquals(3, solution.distributeCandies(new int[]{1,1,2,2,3,3}));
        assertEquals(1, solution.distributeCandies(new int[]{6,6,6,6}));
    }
}