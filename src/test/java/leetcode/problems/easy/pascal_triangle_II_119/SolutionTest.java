package leetcode.problems.easy.pascal_triangle_II_119;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void getRow() {
        Solution solution = new Solution();
        assertEquals(solution.getRow(0), List.of(1));
        assertEquals(solution.getRow(1), List.of(1, 1));
        assertEquals(solution.getRow(2), List.of(1,2,1));
        assertEquals(solution.getRow(3), List.of(1,3,3,1));
        assertEquals(solution.getRow(4), List.of(1,4,6,4,1));
        assertEquals(solution.getRow(5), List.of(1,5,10,10,5,1));
        assertEquals(solution.getRow(6), List.of(1,6,15,20,15,6,1));
    }
}