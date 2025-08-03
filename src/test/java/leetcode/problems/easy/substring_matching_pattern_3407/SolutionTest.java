package leetcode.problems.easy.substring_matching_pattern_3407;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void hasMatch() {
        Solution solution = new Solution();
        assertTrue(solution.hasMatch("leetcode", "*"));
        assertTrue(solution.hasMatch("", "*"));
        assertFalse(solution.hasMatch("", "*p"));
        assertTrue(solution.hasMatch("ojjju", "*o"));
        assertTrue(solution.hasMatch("leetcode", "ee*e"));
        assertFalse(solution.hasMatch("ckckkk", "ck*kc"));

        assertFalse(solution.hasMatch("tokk", "t*t"));
        assertFalse(solution.hasMatch("hello", "*p"));
        assertFalse(solution.hasMatch("hello", "p*"));
        assertTrue(solution.hasMatch("leetcode", "*e"));
        assertTrue(solution.hasMatch("leetcode", "*ee"));
        assertTrue(solution.hasMatch("leetcode", "*eet"));
        assertTrue(solution.hasMatch("leetcode", "*et"));
        assertTrue(solution.hasMatch("leetcode", "ee*tcode"));
        assertTrue(solution.hasMatch("leetcode", "e*code"));
        assertTrue(solution.hasMatch("leetcode", "*eetc"));
        assertTrue(solution.hasMatch("leetcode", "*eetco"));
        assertTrue(solution.hasMatch("leetcode", "*eetcod"));
        assertTrue(solution.hasMatch("leetcode", "*eetcode"));
        assertFalse(solution.hasMatch("leetcode", "*eetcodee"));
        assertFalse(solution.hasMatch("leetcode", "*ea"));
        assertTrue(solution.hasMatch("luck", "u*"));
        assertTrue(solution.hasMatch("luck", "*u"));
        assertFalse(solution.hasMatch("car", "c*v"));
    }
}