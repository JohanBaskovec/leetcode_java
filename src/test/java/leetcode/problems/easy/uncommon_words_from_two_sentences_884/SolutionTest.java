package leetcode.problems.easy.uncommon_words_from_two_sentences_884;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void uncommonFromSentences() {
        Solution s = new Solution();
        assertArrayEquals(new String[]{"sweet", "sour"}, s.uncommonFromSentences("this apple is sweet", "this apple is sour"));
        assertArrayEquals(new String[]{"banana"}, s.uncommonFromSentences("apple apple", "banana"));
    }

}