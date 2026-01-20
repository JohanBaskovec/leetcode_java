package leetcode.problems.easy.set_mismatch_645;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findErrorNums() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{1,2}, s.findErrorNums(new int[]{1,1,3}));
        assertArrayEquals(new int[]{1,2}, s.findErrorNums(new int[]{1,1,3,4,5}));
        assertArrayEquals(new int[]{1,3}, s.findErrorNums(new int[]{1,1,2,4,5}));
        assertArrayEquals(new int[]{1,4}, s.findErrorNums(new int[]{1,1,2,3}));
        assertArrayEquals(new int[]{2,3}, s.findErrorNums(new int[]{1,2,2,4}));
        assertArrayEquals(new int[]{1,2}, s.findErrorNums(new int[]{1,1}));
        assertArrayEquals(new int[]{2,1}, s.findErrorNums(new int[]{2,2}));
        assertArrayEquals(new int[]{2,1}, s.findErrorNums(new int[]{3,2,2}));
        assertArrayEquals(new int[]{3,2}, s.findErrorNums(new int[]{1,3,3}));
    }
}