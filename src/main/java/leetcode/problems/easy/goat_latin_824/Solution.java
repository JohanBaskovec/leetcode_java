package leetcode.problems.easy.goat_latin_824;

public class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sbSentence = new StringBuilder();
        char[] chars = sentence.toCharArray();
        int iWord = 1;
        StringBuilder sbWord = new StringBuilder();
        boolean inWord = false;
        boolean startsWithVowel = false;
        char charForConsonantWord = 0;
        for (int i = 0; i <= chars.length; i++) {
            if (i == chars.length || chars[i] == ' ') {
                if (!startsWithVowel) {
                    sbWord.append(charForConsonantWord);
                }
                sbWord.append("ma");
                for (int j = 0 ; j < iWord ; j++) {
                    sbWord.append('a');
                }
                sbSentence.append(sbWord.toString());
                if (i != chars.length) {
                    sbSentence.append(' ');
                    sbWord = new StringBuilder();
                    iWord++;
                }
                inWord = false;
            } else {
                if (!inWord) {
                    if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u' ||
                    chars[i] == 'A' || chars[i] == 'E' || chars[i] == 'I' || chars[i] == 'O' || chars[i] == 'U') {
                        startsWithVowel = true;
                        sbWord.append(chars[i]);
                    } else {
                        startsWithVowel = false;
                        charForConsonantWord = chars[i];
                    }
                    inWord = true;
                } else {
                    sbWord.append(chars[i]);
                }

            }
        }

        return sbSentence.toString();
    }
}
