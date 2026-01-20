package leetcode.problems.easy.capitalize_the_title_2129;

public class Solution {
    public String capitalizeTitle(String title) {
        char[] ret = title.toCharArray();
        int wordStart = -1;
        boolean inWord = false;
        for (int i = 0; i <= ret.length; i++) {
            if (i == ret.length || ret[i] == ' ') {
                if (inWord) {
                    int wordLength = i - wordStart;
                    if (wordLength <= 2) {
                        for (int j = wordStart ; j < wordStart + wordLength; j++) {
                            ret[j] = Character.toLowerCase(ret[j]);
                        }
                    } else {
                        ret[wordStart] = Character.toUpperCase(ret[wordStart]);
                        for (int j = wordStart + 1; j < wordStart + wordLength; j++) {
                            ret[j] = Character.toLowerCase(ret[j]);
                        }
                    }
                    inWord = false;
                }
            } else {
                if (!inWord) {
                    inWord = true;
                    wordStart = i;
                }
            }
        }
        return new String(ret);
    }
}
