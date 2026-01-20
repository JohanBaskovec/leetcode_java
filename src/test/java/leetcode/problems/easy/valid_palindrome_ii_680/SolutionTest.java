package leetcode.problems.easy.valid_palindrome_ii_680;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void validPalindrome() {
        Solution s = new Solution();
        assertFalse(s.validPalindrome("abc"));
        assertTrue(s.validPalindrome("eceec"));
        assertTrue(s.validPalindrome("aba"));
        assertTrue(s.validPalindrome("ajba"));
        assertTrue(s.validPalindrome("kaba"));
        assertTrue(s.validPalindrome("abka"));
        assertTrue(s.validPalindrome("abak"));
        assertFalse(s.validPalindrome("abakk"));
        assertFalse(s.validPalindrome("kkaba"));
        assertFalse(s.validPalindrome("karba"));
        assertTrue(s.validPalindrome("ebcbbececabbacecbbcbe"));
    }
}