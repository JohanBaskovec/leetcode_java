package leetcode.problems.easy.positions_of_large_groups_830;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void largeGroupPositions() {
        Solution s = new Solution();
        assertEquals(List.of(List.of(3,6)), s.largeGroupPositions("abbxxxxzzy"));
        assertEquals(List.of(), s.largeGroupPositions("abc"));
        assertEquals(List.of(List.of(3,5),List.of(6,9),List.of(12,14)), s.largeGroupPositions("abcdddeeeeaabbbcd"));
    }
}