package leetcode.problems.easy.uncommon_words_from_two_sentences_884;

import java.util.*;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashSet<String> uniqueWords = new HashSet<>();
        HashSet<String> bannedWords = new HashSet<>();
        int iWordStart = 0;
        boolean inWord = true;
        String[] sentences = new String[]{s1, s2};
        for (int iSentence = 0 ; iSentence < sentences.length ; iSentence++) {
            iWordStart = 0;
            inWord = true;
            String sentence = sentences[iSentence];
            int iCharacter = 0;

            while (true) {
                if (iCharacter == sentence.length() || sentence.charAt(iCharacter) == ' ') {
                    inWord = false;
                    String word = sentence.substring(iWordStart, iCharacter);
                    if (!bannedWords.contains(word)) {
                        if (uniqueWords.contains(word)) {
                            uniqueWords.remove(word);
                            bannedWords.add(word);
                        } else {
                            uniqueWords.add(word);
                        }
                    }
                } else {
                    if (!inWord) {
                        iWordStart = iCharacter;
                        inWord = true;
                    }
                }
                if (iCharacter == sentence.length()) {
                    break;
                }
                iCharacter++;
            }
        }

        List<String> result = new ArrayList<>();

        return uniqueWords.toArray(new String[result.size()]);
    }
}
