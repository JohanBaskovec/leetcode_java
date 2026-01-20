package leetcode.problems.easy.largest_number_at_least_twice_of_others_747;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void dominantIndex() {
        Solution s = new Solution();
        assertEquals(1, s.dominantIndex(new int[]{3,6,1,0}));
        assertEquals(-1, s.dominantIndex(new int[]{1,2,3,4}));
    }
}