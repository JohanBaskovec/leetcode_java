package leetcode.problems.easy.robot_return_to_origin_657;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void judgeCircle() {
        Solution s = new Solution();
        assertTrue(s.judgeCircle("UD"));
        assertFalse(s.judgeCircle("LL"));
        assertTrue(s.judgeCircle("LUDR"));
    }
}