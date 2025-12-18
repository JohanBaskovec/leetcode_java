package leetcode.problems.easy.license_key_formatting_482;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void licenseKeyFormatting() {
        Solution solution = new Solution();
        assertEquals("5F3Z-2E9W", solution.licenseKeyFormatting("5F3Z-2e-9-w", 4));
        assertEquals("2-5G-3J", solution.licenseKeyFormatting("2-5g-3-J", 2));
        assertEquals("AA-AA", solution.licenseKeyFormatting("--a-a-a-a--", 2));

    }
}