package leetcode.problems.easy.squares_of_a_sorted_array_977;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void sortedSquares() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{1}, s.sortedSquares(new int[]{-1}));
        assertArrayEquals(new int[]{0,1,9,16,100}, s.sortedSquares(new int[]{-4,-1,0,3,10}));
        assertArrayEquals(new int[]{0,9,100}, s.sortedSquares(new int[]{0,3,10}));
        assertArrayEquals(new int[]{0,9,100}, s.sortedSquares(new int[]{0,-3,10}));
        assertArrayEquals(new int[]{1,4,9,25}, s.sortedSquares(new int[]{-5,-3,-2,-1}));
    }
}