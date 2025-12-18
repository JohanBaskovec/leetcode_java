package leetcode.problems.easy.add_digits_258;

public class Solution {
    public int addDigits(int num) {
        int sum = num;
        while (sum > 9) {
            int sumTmp = 0;
            int rest = sum;
            while (rest > 0) {
                int mod = rest % 10;
                sumTmp += mod;
                rest /= 10;
            }
            sum = sumTmp;
        }
        return sum;
    }
}
