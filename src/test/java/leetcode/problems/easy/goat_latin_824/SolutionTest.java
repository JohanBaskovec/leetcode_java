package leetcode.problems.easy.goat_latin_824;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void toGoatLatin() {
        Solution s = new Solution();
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", s.toGoatLatin("I speak Goat Latin"));
    }
}