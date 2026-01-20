package leetcode.problems.easy.shortest_completing_word_748;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        char[] licensePlateChars= licensePlate.toCharArray();
        int[] charCounts = new int[260];
        int nCharsInLicensePlate = 0;
        for (char c : licensePlateChars) {
            if (!Character.isAlphabetic(c)) {
                continue;
            }
            char lower = Character.toLowerCase(c);
            charCounts[lower]++;
            nCharsInLicensePlate++;
        }
        int lengthShortestMatch = Integer.MAX_VALUE;
        String shortestMatch = words[0];
        for (String word : words) {
            if (word.length() >= lengthShortestMatch || word.length() < nCharsInLicensePlate) {
                continue;
            }
            char[] wordChars = word.toCharArray();
            int[] wordCharCounts = new int[260];
            int nCharsLeft = nCharsInLicensePlate;
            for (char c : wordChars) {
                wordCharCounts[c]++;
                if (wordCharCounts[c] == charCounts[c]) {
                    nCharsLeft -= charCounts[c];
                    if (nCharsLeft == 0) {
                        lengthShortestMatch = wordChars.length;
                        shortestMatch = word;
                        break;
                    }
                }
            }
        }
        return shortestMatch;
    }
}
