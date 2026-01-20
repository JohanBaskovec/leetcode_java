package leetcode.problems.easy.defuse_the_bomb_1652;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void decrypt() {
        Solution s = new Solution();
        //assertArrayEquals(new int[]{12,10,16,13}, s.decrypt(new int[]{5,7,1,4}, 3));
        assertArrayEquals(new int[]{12,5,6,13}, s.decrypt(new int[]{2,4,9,3}, -2));
    }
}