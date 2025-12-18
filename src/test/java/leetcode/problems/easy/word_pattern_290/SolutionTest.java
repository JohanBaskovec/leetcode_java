package leetcode.problems.easy.word_pattern_290;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void wordPattern() {
        Solution s = new Solution();
        assertTrue(s.wordPattern("abba", "dog cat cat dog"));
        assertFalse(s.wordPattern("abba", "dog cat cat fish"));
        assertFalse(s.wordPattern("aaaa", "dog cat cat dog"));
        assertFalse(s.wordPattern("abba", "dog dog dog dog"));
        assertFalse(s.wordPattern("aaa", "aa aa aa aa"));
        assertFalse(s.wordPattern("aaaa", "aa aa aa"));
    }

}