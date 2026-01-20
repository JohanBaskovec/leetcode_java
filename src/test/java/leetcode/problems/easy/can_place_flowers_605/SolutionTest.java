package leetcode.problems.easy.can_place_flowers_605;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canPlaceFlowers() {
        Solution s = new Solution();
        assertTrue(s.canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        assertFalse(s.canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        assertTrue(s.canPlaceFlowers(new int[]{0,0,0,0,1}, 2));
        assertFalse(s.canPlaceFlowers(new int[]{0,0,0,0,1}, 3));
    }
}