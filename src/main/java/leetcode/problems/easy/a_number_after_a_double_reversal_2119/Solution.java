package leetcode.problems.easy.a_number_after_a_double_reversal_2119;

public class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }
        return num % 10 != 0;
    }
}
