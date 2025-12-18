package leetcode.problems.easy.keyboard_row_500;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findWords() {
        Solution s = new Solution();
        assertArrayEquals(new String[]{"Alaska","Dad"}, s.findWords(new String[]{"Hello","Alaska","Dad","Peace"}));
    }
}