package leetcode.problems.easy.replace_all_digits_with_character_1844;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void replaceDigits() {
        Solution solution = new Solution();
        assertEquals("abcdef", solution.replaceDigits("a1c1e1"));
        assertEquals("abbdcfdhe", solution.replaceDigits("a1b2c3d4e"));

    }
}