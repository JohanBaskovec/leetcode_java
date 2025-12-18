package leetcode.problems.find_the_difference_389;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void findTheDifference() {
        Solution s = new Solution();
        assertEquals('e', s.findTheDifference("abcd", "abcde"));
        assertEquals('a', s.findTheDifference("abd", "aabd"));
        assertEquals('z', s.findTheDifference("", "z"));
    }

}