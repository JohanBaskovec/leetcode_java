package leetcode.problems.easy.find_pivot_index_724;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void pivotIndex() {
        Solution s =  new Solution();
        assertEquals(3, s.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}