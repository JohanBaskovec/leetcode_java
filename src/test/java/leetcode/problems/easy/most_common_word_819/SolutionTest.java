package leetcode.problems.easy.most_common_word_819;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void mostCommonWord() {
        Solution s = new Solution();
        assertEquals("ball", s.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}));
    }
}