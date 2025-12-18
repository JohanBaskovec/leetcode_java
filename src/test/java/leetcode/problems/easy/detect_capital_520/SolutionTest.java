package leetcode.problems.easy.detect_capital_520;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void detectCapitalUse() {
        Solution s = new Solution();
        assertTrue(s.detectCapitalUse("A"));
        assertTrue(s.detectCapitalUse("a"));
        assertTrue(s.detectCapitalUse("abc"));
        assertTrue(s.detectCapitalUse("ABC"));
        assertTrue(s.detectCapitalUse("Abc"));
        assertFalse(s.detectCapitalUse("aB"));
        assertFalse(s.detectCapitalUse("aBc"));
        assertFalse(s.detectCapitalUse("ABc"));
        assertFalse(s.detectCapitalUse("aBc"));
        assertFalse(s.detectCapitalUse("FlaG"));
    }

}