package leetcode.problems.hard.regular_expression_matching_10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isMatch() {
        Solution solution = new Solution();
        assertFalse(solution.isMatch("aa", "a"));
        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("ab", ".*"));
    }
}