package leetcode.problems.easy.lemonade_change_860;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lemonadeChange() {
        Solution s = new Solution();
        assertTrue(s.lemonadeChange(new int[]{5,5,5,10,20}));
        assertFalse(s.lemonadeChange(new int[]{5,5,10,10,20}));
        assertFalse(s.lemonadeChange(new int[]{10}));
        assertTrue(s.lemonadeChange(new int[]{5}));
        assertTrue(s.lemonadeChange(new int[]{5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5}));
        // 5:                                 1 2 1  0  1 2 3 4 5 6 7 8 9 8 9  10
        // 10:                                    1  0
        // 20:                                       1                           2
    }
}