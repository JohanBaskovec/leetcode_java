package leetcode.problems.easy.prime_number_of_set_bits_in_binary_representation_762;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void countPrimeSetBits() {
        Solution s = new Solution();
        assertEquals(4, s.countPrimeSetBits(6, 10));
        assertEquals(5, s.countPrimeSetBits(10, 15));

    }
}