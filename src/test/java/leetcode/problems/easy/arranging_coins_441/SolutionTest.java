package leetcode.problems.easy.arranging_coins_441;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void arrangeCoins() {
        Solution s = new Solution();
        assertEquals(2,  s.arrangeCoins(5));
        assertEquals(3,  s.arrangeCoins(8));
        assertEquals(60070,  s.arrangeCoins(1804289383));
    }
}