package leetcode.problems.easy.sort_array_by_parity_905;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortArrayByParity() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{4,2,1,3}, s.sortArrayByParity(new int[]{3,1,2,4}));
        assertArrayEquals(new int[]{0,2}, s.sortArrayByParity(new int[]{0,2}));
    }
}