package leetcode.problems.easy.sort_integers_by_number_of_1_bits_1356;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortByBits() {
        Solution s = new Solution();
        int[] sorted = s.sortByBits(new int[]{0,1,2,3,4,5,6,7,8});
        assertArrayEquals(new int[]{0,1,2,4,8,3,5,6,7}, sorted);
    }
}