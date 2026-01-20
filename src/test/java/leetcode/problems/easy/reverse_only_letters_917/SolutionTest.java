package leetcode.problems.easy.reverse_only_letters_917;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseOnlyLetters() {
        Solution s = new Solution();
        assertEquals("dc-ba", s.reverseOnlyLetters("ab-cd"));
    }
}