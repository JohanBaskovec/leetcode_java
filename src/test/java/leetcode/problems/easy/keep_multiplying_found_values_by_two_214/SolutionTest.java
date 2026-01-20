package leetcode.problems.easy.keep_multiplying_found_values_by_two_214;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findFinalValue() {
        Solution s = new Solution();
        assertEquals(24, s.findFinalValue(new int[]{5,3,6,1,12}, 3));
        assertEquals(4, s.findFinalValue(new int[]{2,7,9}, 4));
    }
}