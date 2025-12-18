package leetcode.problems.easy.valid_perfect_square_367;

public class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        long low = 1;
        long high = num / 2;
        while (low <= high) {
            long mid = (high + low) / 2;
            long mul = mid * mid;
            if (mul == num) {
                return true;
            }
            if (mul > num) {
                high = mid - 1;
            } else if (mul < num) {
                low = mid + 1;
            }
        }
        return false;
    }
}
