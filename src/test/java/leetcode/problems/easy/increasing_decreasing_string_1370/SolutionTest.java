package leetcode.problems.easy.increasing_decreasing_string_1370;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortString() {
        Solution s = new Solution();
        assertEquals("abccbaabccba", s.sortString("aaaabbbbcccc"));
    }
}