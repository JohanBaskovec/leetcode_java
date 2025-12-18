package leetcode.problems.easy.find_numbers_disappeared_448;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findDisappearedNumbers() {
        Solution s = new Solution();
        assertEquals(List.of(5, 6), s.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        assertEquals(List.of(), s.findDisappearedNumbers(new int[]{1, 2, 3}));
        assertEquals(List.of(), s.findDisappearedNumbers(new int[]{1}));
        assertEquals(List.of(2), s.findDisappearedNumbers(new int[]{1, 1}));
    }
}