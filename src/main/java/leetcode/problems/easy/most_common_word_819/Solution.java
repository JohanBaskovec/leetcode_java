package leetcode.problems.easy.most_common_word_819;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> bannedSet = new HashSet<>();
        bannedSet.addAll(Arrays.asList(banned));
        Map<String, Integer> wordCount = new HashMap<>();
        char[] chars = paragraph.toCharArray();
        int i = 0;
        while (i < chars.length && !Character.isAlphabetic(chars[i])) {
            i++;
        }
        int wordStart = i;
        boolean inWord = true;
        for (; i <= chars.length; i++) {
            if (inWord) {
                if (i == chars.length || !Character.isAlphabetic(chars[i])) {
                    inWord = false;
                    String word = paragraph.substring(wordStart, i).toLowerCase();
                    if (wordCount.containsKey(word)) {
                        wordCount.put(word, wordCount.get(word) + 1);
                    } else {
                        wordCount.put(word, 1);
                    }
                }
            } else {
                if (i != chars.length && Character.isAlphabetic(chars[i])) {
                    inWord = true;
                    wordStart = i;
                }
            }
        }
        int maxOccurence = 0;
        String maxOcurrenceStr = "";
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxOccurence && !bannedSet.contains(entry.getKey())) {
                maxOccurence = entry.getValue();
                maxOcurrenceStr = entry.getKey();
            }
        }
        return maxOcurrenceStr;
    }
}
