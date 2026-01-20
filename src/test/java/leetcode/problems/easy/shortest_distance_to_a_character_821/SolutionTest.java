package leetcode.problems.easy.shortest_distance_to_a_character_821;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shortestToChar() {
        Solution s = new Solution();
        assertArrayEquals(new int[]{3,2,1,0,1,0,0,1,2,2,1,0}, s.shortestToChar("loveleetcode", 'e'));
    }
}