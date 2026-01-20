package leetcode.problems.easy.find_common_characters_1002;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void commonChars() {
        Solution s = new Solution();
        assertEquals(List.of("e", "l", "l"), s.commonChars(new String[]{"bella","label","roller"}));
        assertEquals(List.of("c", "o"), s.commonChars(new String[]{"cool","lock","cook"}));
    }
}