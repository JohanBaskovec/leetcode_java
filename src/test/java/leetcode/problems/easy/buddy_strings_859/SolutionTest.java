package leetcode.problems.easy.buddy_strings_859;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void buddyStrings() {
        Solution solution = new Solution();
        assertTrue(solution.buddyStrings("ab", "ba"));
        assertFalse(solution.buddyStrings("ab", "ab"));
        assertTrue(solution.buddyStrings("aa", "aa"));
        assertTrue(solution.buddyStrings("aab", "aab"));
        assertTrue(solution.buddyStrings("abc", "acb"));
        assertFalse(solution.buddyStrings("abc", "abk"));
        assertTrue(solution.buddyStrings("aba", "aba"));
        assertTrue(solution.buddyStrings("aaa", "aaa"));
        assertFalse(solution.buddyStrings("abc", "abc"));
    }
}