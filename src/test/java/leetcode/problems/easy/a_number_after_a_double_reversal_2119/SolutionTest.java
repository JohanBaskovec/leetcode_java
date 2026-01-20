package leetcode.problems.easy.a_number_after_a_double_reversal_2119;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isSameAfterReversals() {
        Solution solution = new Solution();
        assertTrue(solution.isSameAfterReversals(1));
        assertTrue(solution.isSameAfterReversals(2));
        assertTrue(solution.isSameAfterReversals(0));
        assertTrue(solution.isSameAfterReversals(201));
        assertTrue(solution.isSameAfterReversals(202));
        assertFalse(solution.isSameAfterReversals(200));
    }
}