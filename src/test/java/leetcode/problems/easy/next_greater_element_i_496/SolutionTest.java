package leetcode.problems.easy.next_greater_element_i_496;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void nextGreaterElement() {
        Solution solution = new Solution();
        assertArrayEquals(new int[]{-1,3,-1}, solution.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2}));
        assertArrayEquals(new int[]{3,-1}, solution.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4}));
    }
}