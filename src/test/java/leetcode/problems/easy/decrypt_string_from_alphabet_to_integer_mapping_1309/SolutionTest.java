package leetcode.problems.easy.decrypt_string_from_alphabet_to_integer_mapping_1309;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void freqAlphabets() {
        Solution s = new Solution();
        assertEquals("jkab", s.freqAlphabets("10#11#12"));
    }
}