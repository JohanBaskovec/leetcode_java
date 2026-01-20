package leetcode.problems.easy.faulty_keyboard_2810;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void finalString() {
        Solution s = new Solution();
        assertEquals("rtsng", s.finalString("string"));
        assertEquals("ponter", s.finalString("poiinter"));
        assertEquals("cog", s.finalString("goci"));
        assertEquals("wvf", s.finalString("viwif"));

    }
}