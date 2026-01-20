package leetcode.problems.easy.perfect_number_507;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkPerfectNumber() {
        Solution s  = new Solution();
        assertTrue(s.checkPerfectNumber(6));
        assertTrue(s.checkPerfectNumber(28));
    }
}