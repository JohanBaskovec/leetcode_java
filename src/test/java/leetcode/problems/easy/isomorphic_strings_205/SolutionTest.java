package leetcode.problems.easy.isomorphic_strings_205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void isIsomorphic() {
        Solution solution = new Solution();
        assertTrue(solution.isIsomorphic("egg", "add"));
        assertFalse(solution.isIsomorphic("foo", "bar"));
        assertTrue(solution.isIsomorphic("paper", "title"));
        assertFalse(solution.isIsomorphic("badc", "baba"));
    }
}