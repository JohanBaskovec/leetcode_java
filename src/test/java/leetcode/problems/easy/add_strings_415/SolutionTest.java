package leetcode.problems.easy.add_strings_415;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void test() {
        Solution s = new Solution();
        assertEquals("0", s.addStrings("0", "0"));
        assertEquals("7", s.addStrings("0", "7"));
        assertEquals("7", s.addStrings("7", "0"));
        assertEquals("12", s.addStrings("6", "6"));
        assertEquals("19", s.addStrings("10", "9"));
        assertEquals("23", s.addStrings("11", "12"));
    }

}