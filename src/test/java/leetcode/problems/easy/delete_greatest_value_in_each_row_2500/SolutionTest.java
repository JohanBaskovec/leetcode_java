package leetcode.problems.easy.delete_greatest_value_in_each_row_2500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void deleteGreatestValue() {
        Solution s = new Solution();
        assertEquals(8, s.deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}}));
    }
}