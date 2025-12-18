package leetcode.problems.easy.longest_palindrome_409;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void longestPalindrome() {
        Solution solution = new Solution();
        assertEquals(7, solution.longestPalindrome("abccccdd"));
        assertEquals(1, solution.longestPalindrome("a"));
        assertEquals(0, solution.longestPalindrome(""));
        assertEquals(1, solution.longestPalindrome("Aa"));
        assertEquals(3, solution.longestPalindrome("AAa"));
        assertEquals(3, solution.longestPalindrome("AAab"));
    }

}