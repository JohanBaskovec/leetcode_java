package leetcode.problems.easy.shortest_completing_word_748;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void shortestCompletingWord() {
        Solution solution = new Solution();
        assertEquals("steps", solution.shortestCompletingWord("1s3 PSt", new String[]{"step","steps","stripe","stepple"}));
        assertEquals("pest", solution.shortestCompletingWord("1s3 456", new String[]{"looks","pest","stew","show"}));
    }
}