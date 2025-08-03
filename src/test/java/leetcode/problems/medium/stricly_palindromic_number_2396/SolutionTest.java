package leetcode.problems.medium.stricly_palindromic_number_2396;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void isStrictlyPalindromic() {
        Solution solution = new Solution();
        assertFalse(solution.isStrictlyPalindromic(9));
        assertFalse(solution.isStrictlyPalindromic(4));
        assertTrue(solution.isStrictlyPalindromic(3));
    }
}