package leetcode.problems.easy.longest_uncommon_sequence_i_521;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findLUSlength() {
        Solution solution = new Solution();
        assertEquals(3, solution.findLUSlength("aba", "cdc"));
        assertEquals(3, solution.findLUSlength("aba", "bbb"));
        assertEquals(-1, solution.findLUSlength("aaa", "aaa"));
        assertEquals(17, solution.findLUSlength("aefawfawfawfaw", "aefawfeawfwafwaef"));

    }
}