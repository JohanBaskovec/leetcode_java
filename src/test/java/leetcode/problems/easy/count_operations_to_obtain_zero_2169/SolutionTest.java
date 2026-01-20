package leetcode.problems.easy.count_operations_to_obtain_zero_2169;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countOperations() {
        Solution s = new Solution();
        assertEquals(3, s.countOperations(2, 3));
        assertEquals(2, s.countOperations(1, 2));
    }
}