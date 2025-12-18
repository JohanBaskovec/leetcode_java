package leetcode.problems.easy.number_of_segments_in_string_434;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countSegments() {
        Solution solution = new Solution();
        assertEquals(5, solution.countSegments("Hello, my name is John"));
    }
}