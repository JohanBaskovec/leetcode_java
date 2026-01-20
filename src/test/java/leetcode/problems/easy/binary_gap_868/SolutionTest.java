package leetcode.problems.easy.binary_gap_868;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void binaryGap() {
        Solution s = new Solution();
        assertEquals(2, s.binaryGap(22));
        assertEquals(0, s.binaryGap(8));
        assertEquals(2, s.binaryGap(5));
        assertEquals(1, s.binaryGap(3));
        assertEquals(1, s.binaryGap(6));
    }
}