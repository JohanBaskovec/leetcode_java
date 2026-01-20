package leetcode.problems.easy.n_repeated_element_in_size_2n_array_961;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void repeatedNTimes() {
        Solution s = new Solution();
        assertEquals(3, s.repeatedNTimes(new int[]{1, 2, 3, 3}));
        assertEquals(2, s.repeatedNTimes(new int[]{2,1,2,5,3,2}));
        assertEquals(5, s.repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }
}