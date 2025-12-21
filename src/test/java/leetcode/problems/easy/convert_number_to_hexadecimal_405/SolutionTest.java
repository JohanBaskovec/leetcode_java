package leetcode.problems.easy.convert_number_to_hexadecimal_405;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toHex() {
        Solution s = new Solution();
        //assertEquals("1a", s.toHex(26));
        assertEquals("ffffffff", s.toHex(-1));
    }
}