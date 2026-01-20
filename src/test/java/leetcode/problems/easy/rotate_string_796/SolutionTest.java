package leetcode.problems.easy.rotate_string_796;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void rotateString() {
        Solution s = new Solution();
        assertTrue(s.rotateString("abcde", "cdeab"));
        assertTrue(s.rotateString("a", "a"));
        assertTrue(s.rotateString("ab", "ab"));
        assertFalse(s.rotateString("abc", "ab"));
        assertFalse(s.rotateString("abcde", "abced"));
        assertFalse(s.rotateString("abcde", "debac"));
        assertTrue(s.rotateString("defdefdefabcabc", "defdefabcabcdef"));

    }
}