package leetcode.problems.easy.longest_palindrome_409;

public class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int['z' - 'A' + 1];
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            charCount[aChar - 'A']++;
        }
        boolean hasSingle = false;
        int nDoubles = 0;
        for (int j : charCount) {
            nDoubles += (j / 2);
            if (j % 2 == 1) {
                hasSingle = true;
            }
        }
        return nDoubles * 2 + (hasSingle ? 1 : 0);
    }
}
