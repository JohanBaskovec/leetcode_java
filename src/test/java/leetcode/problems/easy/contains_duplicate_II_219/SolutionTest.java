package leetcode.problems.easy.contains_duplicate_II_219;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void containsDuplicate() {
        Solution solution = new Solution();
        assertTrue(solution.containsNearbyDuplicate(new int[]{0,3,2,1,3}, 3));
    }
}