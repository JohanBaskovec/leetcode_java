package leetcode.problems.easy.reverse_vowels_in_string_345;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseVowels() {
        Solution s = new Solution();
        assertEquals("", s.reverseVowels(""));
        assertEquals("a", s.reverseVowels("a"));
        assertEquals("ab", s.reverseVowels("ab"));
        assertEquals("aba", s.reverseVowels("aba"));
        assertEquals("abo", s.reverseVowels("oba"));
        assertEquals("habo", s.reverseVowels("hoba"));
        assertEquals("ahabo", s.reverseVowels("ohaba"));
        assertEquals("holle", s.reverseVowels("hello"));
    }
}