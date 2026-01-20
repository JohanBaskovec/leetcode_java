package leetcode.problems.easy.capitalize_the_title_2129;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void capitalizeTitle() {
        Solution s = new Solution();
        assertEquals("Hello my Name is Bob", s.capitalizeTitle("HELLO MY nAmE Is BOb"));
        assertEquals("", s.capitalizeTitle(""));
        assertEquals("a", s.capitalizeTitle("a"));
        assertEquals("ab", s.capitalizeTitle("ab"));
        assertEquals("Abc", s.capitalizeTitle("abc"));
    }
}