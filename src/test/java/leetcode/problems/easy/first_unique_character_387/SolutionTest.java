package leetcode.problems.easy.first_unique_character_387;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstUniqChar() {
        Solution solution = new Solution();
        assertEquals(0, solution.firstUniqChar("leetcode"));
        assertEquals(1, solution.firstUniqChar("bab"));
        assertEquals(-1, solution.firstUniqChar("baba"));
        assertEquals(-1, solution.firstUniqChar(""));
    }
}