package leetcode.problems.easy.consecutive_characters_1446;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxPower() {
        Solution s = new Solution();
        assertEquals(5, s.maxPower("abbcccddddeeeeedcba"));
        assertEquals(1, s.maxPower("abcd"));
        assertEquals(5, s.maxPower("aaaaa"));
        assertEquals(1, s.maxPower("a"));
    }
}