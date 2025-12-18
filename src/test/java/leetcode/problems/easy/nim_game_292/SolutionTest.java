package leetcode.problems.easy.nim_game_292;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canWinNim() {
        Solution solution = new Solution();
        assertFalse(solution.canWinNim(8));
        assertTrue(solution.canWinNim(7));
    }
}