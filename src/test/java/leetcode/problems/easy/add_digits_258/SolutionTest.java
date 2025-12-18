package leetcode.problems.easy.add_digits_258;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void addDigits() {
        Solution s = new Solution();
        assertEquals(1, s.addDigits(1));
        assertEquals(2, s.addDigits(2));
        assertEquals(2, s.addDigits(11));
        assertEquals(2, s.addDigits(29));
        assertEquals(3, s.addDigits(39));
    }
}