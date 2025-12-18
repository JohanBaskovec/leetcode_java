package leetcode.problems.easy.valid_anagram_242;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram() {
        Solution s = new Solution();
        assertTrue(s.isAnagram("hello", "olleh"));
        assertTrue(s.isAnagram("helol", "olleh"));
        assertTrue(s.isAnagram("", ""));
        assertTrue(s.isAnagram("e", "e"));
        assertFalse(s.isAnagram("hell", "olleh"));
        assertFalse(s.isAnagram("hellp", "olleh"));
        assertTrue(s.isAnagram("anagram", "nagaram"));
    }
}