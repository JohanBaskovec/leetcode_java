package leetcode.problems.easy.first_bad_version_278;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void firstBadVersion() {
        assertEquals(3, new Solution(3).firstBadVersion(3));
        assertEquals(1000, new Solution(1000).firstBadVersion(1000));
        assertEquals(2, new Solution(2).firstBadVersion(3));
        assertEquals(1, new Solution(1).firstBadVersion(3));
        assertEquals(4, new Solution(4).firstBadVersion(10));
        assertEquals(1702766813, new Solution(1702766813).firstBadVersion(1702766819));
        assertEquals(1702766719, new Solution(1702766719).firstBadVersion(2126753390));

    }
}