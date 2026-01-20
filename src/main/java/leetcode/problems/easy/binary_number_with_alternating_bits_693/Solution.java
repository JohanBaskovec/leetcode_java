package leetcode.problems.easy.binary_number_with_alternating_bits_693;

public class Solution {
    public boolean hasAlternatingBits(int n) {
        // We can solve by checking if n is the geometric sum of the
        // geometric series 1 + 4 + 16 + 64 + ...
        // (the first term is 1 and the ratio is 4)
        double res0 = customLog(4, 3 * (double)n + 1);
        if(res0 >= 1 && Math.floor(res0) == res0) {
            return true;
        }
        // or if it's the geometric sum of 2 + 8 + 32 + 128...
        double res1 = customLog(4.0, (3.0 * (double)n + 2.0) / 2.0);
        return res1 >= 1 && Math.floor(res1) == res1;
    }

    private static double customLog(double base, double logNumber) {
        return Math.log(logNumber) / Math.log(base);
    }
}
