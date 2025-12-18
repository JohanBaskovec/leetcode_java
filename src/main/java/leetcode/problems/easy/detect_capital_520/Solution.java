package leetcode.problems.easy.detect_capital_520;

public class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) {
            return true;
        }
        char[] chars = word.toCharArray();
        boolean firstCharIsCapital = Character.isUpperCase(chars[0]);
        boolean secondCharIsCapital = Character.isUpperCase(chars[1]);
        if (!firstCharIsCapital && secondCharIsCapital) {
            return false;
        }

        if (!secondCharIsCapital) {
            for (int i = 2; i < word.length(); i++) {
                if (Character.isUpperCase(chars[i])) {
                        return false;
                }
            }
        }
        if (firstCharIsCapital && secondCharIsCapital) {
            for (int i = 2; i < word.length(); i++) {
                if (!Character.isUpperCase(chars[i])) {
                        return false;
                }
            }
        }

/*
        for (int i = 2; i < word.length(); i++) {
            if (Character.isUpperCase(chars[i])) {
                if (!secondCharIsCapital) {
                    return false;
                }
            } else {
                if (firstCharIsCapital && secondCharIsCapital) {
                    return false;
                }
            }
        }
*/
        return true;

    }
}
