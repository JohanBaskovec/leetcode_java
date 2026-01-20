package leetcode.problems.easy.divide_a_string_into_groups_of_size_k_2138;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void divideString() {
        Solution s = new Solution();
        assertArrayEquals(new String[]{"abc","def","ghi"}, s.divideString("abcdefghi", 3, 'x'));
        assertArrayEquals(new String[]{"abc","def","ghi","jxx"}, s.divideString("abcdefghij", 3, 'x'));
    }
}