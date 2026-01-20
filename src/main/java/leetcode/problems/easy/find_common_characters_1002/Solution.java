package leetcode.problems.easy.find_common_characters_1002;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> commonChars(String[] words) {

        int[] charactersCount = new int[255];
        for (int j = 0; j < words[0].length(); j++) {
            charactersCount[words[0].charAt(j)]++;
        }
        for (int i = 1; i < words.length; i++) {
            int[] currentWordCharactersCount = new int[255];
            for (int j = 0 ; j < words[i].length(); j++) {
                char c = words[i].charAt(j);
                currentWordCharactersCount[c]++;
            }
            for (int j = (int)'a'; j <= (int)'z'; j++) {
                currentWordCharactersCount[j] = Math.min(charactersCount[j], currentWordCharactersCount[j]);
            }
            charactersCount = currentWordCharactersCount;
        }
        List<String> result = new ArrayList<>();
        for (int i = 'a' ; i <= 'z'; i++) {
            for (int j = 0 ; j < charactersCount[i] ; j++) {
                result.add(String.valueOf((char)(i)));
            }
        }
        return result;
    }
}
