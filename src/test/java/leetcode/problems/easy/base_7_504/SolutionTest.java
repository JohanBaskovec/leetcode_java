package leetcode.problems.easy.base_7_504;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void convertToBase7() {
        Solution solution = new Solution();
        assertEquals("202", solution.convertToBase7(100));
        assertEquals("-10", solution.convertToBase7(-7));
    }
}