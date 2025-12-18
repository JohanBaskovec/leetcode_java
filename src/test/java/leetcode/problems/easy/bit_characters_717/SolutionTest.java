package leetcode.problems.easy.bit_characters_717;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isOneBitCharacter() {
        Solution s = new Solution();
        assertTrue(s.isOneBitCharacter(new int[]{1,0,0}));
        assertFalse(s.isOneBitCharacter(new int[]{1,1,1,0}));
    }
}