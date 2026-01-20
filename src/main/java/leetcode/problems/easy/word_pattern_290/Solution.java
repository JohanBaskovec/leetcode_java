package leetcode.problems.easy.word_pattern_290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<String, Character> wordToCharMap = new HashMap<>();
        Map<Character, String> charToWordMap = new HashMap<>();
        char[] patternChars = pattern.toCharArray();
        char[] stringChars = s.toCharArray();
        int wordStart = 0;
        int stringCharsIndex = 0;

        int patternCharIndex = 0;
        for (; patternCharIndex < patternChars.length; patternCharIndex++) {
            while (stringCharsIndex < stringChars.length && stringChars[stringCharsIndex] != ' ') {
                stringCharsIndex++;
            }
            if (stringCharsIndex > stringChars.length) {
                return false;
            }
            String word = new String(stringChars, wordStart, stringCharsIndex - wordStart);
            String mappedWord = charToWordMap.get(patternChars[patternCharIndex]);
            if (mappedWord == null) {
                if (wordToCharMap.containsKey(word)) {
                    return false;
                }
                wordToCharMap.put(word, patternChars[patternCharIndex]);
                charToWordMap.put(patternChars[patternCharIndex], word);
            } else if (!mappedWord.equals(word)) {
                return false;
            }
            stringCharsIndex++;
            wordStart = stringCharsIndex;
        }
        return patternCharIndex == patternChars.length && (stringCharsIndex - 1) == stringChars.length;
    }
}
