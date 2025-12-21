package leetcode.problems.easy.di_string_match_942;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void diStringMatch() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{0,4,1,3,2}, s.diStringMatch("IDID"));
    }
}