package leetcode.problems.easy.valid_palindrome_125;

class Solution {
    @SuppressWarnings("BooleanMethodIsAlwaysInverted")
    private boolean isAlphanumeric(char c) {
        return Character.isAlphabetic(c) || Character.isDigit(c);
    }

    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int iLeft = 0;
        int iRight = chars.length - 1;
        while (iLeft <= iRight) {
            char leftChar = chars[iLeft];
            char rightChar = chars[iRight];
            if (!isAlphanumeric(leftChar)) {
                do {
                    iLeft++;
                    if (iLeft == s.length()) {
                        return true;
                    }
                    if (iLeft > iRight) {
                        return true;
                    }
                    leftChar = chars[iLeft];
                } while (!isAlphanumeric(leftChar));
            }

            if (!isAlphanumeric(rightChar)) {
                do {
                    iRight--;
                    if (iRight < 0) {
                        return true;
                    }
                    if (iLeft > iRight) {
                        return true;
                    }
                    rightChar = chars[iRight];
                } while (!(Character.isAlphabetic(rightChar) || Character.isDigit(rightChar)));
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                return false;
            }
            iLeft++;
            iRight--;
        }
        return true;
    }
}
