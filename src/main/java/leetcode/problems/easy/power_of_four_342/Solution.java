package leetcode.problems.easy.power_of_four_342;

public class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (Integer.bitCount(n) != 1) {
            return false;
        }
        while (true) {
            n /= 4;
            if (n == 1) {
                return true;
            }
            if (n == 0) {
                return false;
            }
        }
    }
}
