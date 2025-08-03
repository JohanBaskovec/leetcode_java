package leetcode.problems.easy.valid_palindrome_125;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isPalindrome() {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("race a car"));
        assertTrue(solution.isPalindrome(" "));
        assertTrue(solution.isPalindrome("  "));
        assertTrue(solution.isPalindrome("   "));
        assertTrue(solution.isPalindrome("r"));
        assertTrue(solution.isPalindrome(" r "));
        assertTrue(solution.isPalindrome(" rr "));
        assertTrue(solution.isPalindrome(" r.r "));
        assertTrue(solution.isPalindrome(""));
        assertFalse(solution.isPalindrome("a.b,."));
    }
}