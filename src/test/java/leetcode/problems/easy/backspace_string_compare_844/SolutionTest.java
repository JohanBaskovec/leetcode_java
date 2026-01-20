package leetcode.problems.easy.backspace_string_compare_844;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void backspaceCompare() {
        Solution s = new Solution();
        assertTrue(s.backspaceCompare("ab#c","ad#c"));
        assertTrue(s.backspaceCompare("ab##","c#d#"));
    }
}