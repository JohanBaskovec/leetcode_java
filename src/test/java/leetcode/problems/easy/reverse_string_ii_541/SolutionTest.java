package leetcode.problems.easy.reverse_string_ii_541;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseStr() {
        Solution s = new Solution();
        assertEquals("bacdfeg", s.reverseStr("abcdefg", 2));
        assertEquals("a", s.reverseStr("a", 2));
        assertEquals("cbadefg", s.reverseStr("abcdefg", 3));
        assertEquals("gfedcba", s.reverseStr("abcdefg", 8));
    }
}