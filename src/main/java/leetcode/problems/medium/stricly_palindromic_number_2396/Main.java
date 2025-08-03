package leetcode.problems.medium.stricly_palindromic_number_2396;

class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int iBase = 2 ; iBase <= n - 2 ; iBase++) {
            char[] representation = Integer.toString(n, iBase).toCharArray();
            for (int iCharLeft = 0, iCharRight = representation.length - 1 ; iCharLeft <= iCharRight ; iCharLeft++) {
                if (representation[iCharLeft] != representation[iCharRight]) {
                    return false;
                }
            }
        }
        return true;
    }
}
