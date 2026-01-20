package leetcode.problems.easy.find_smalles_letter_greater_than_target_744;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void nextGreatestLetter() {
        Solution s = new Solution();
        assertEquals('d', s.nextGreatestLetter(new char[]{'a', 'b', 'd'}, 'c'));
        assertEquals('a', s.nextGreatestLetter(new char[]{'a', 'b', 'd'}, 'z'));
        assertEquals('d', s.nextGreatestLetter(new char[]{'a', 'b', 'c', 'c', 'd'}, 'c'));
        assertEquals('c', s.nextGreatestLetter(new char[]{'c','f','j'}, 'a'));
        assertEquals('f', s.nextGreatestLetter(new char[]{'c','f','j'}, 'c'));
        assertEquals('x', s.nextGreatestLetter(new char[]{'x', 'x', 'y', 'y'}, 'z'));
        assertEquals('c', s.nextGreatestLetter(new char[]{'c', 'f', 'j'}, 'z'));
    }
}