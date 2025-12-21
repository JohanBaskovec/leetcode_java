package leetcode.problems.easy.ugly_number_263;

public class Solution {
    public boolean isUgly(int n) {
        if (n < 1) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        int[] dividers = new int[]{2, 3, 5};
        int rest = n;
        while (rest > 1) {
            boolean dividable = false;
            for (int i = 0; i < dividers.length; i++) {
                if (rest % dividers[i] == 0) {
                    rest = rest / dividers[i];
                    dividable = true;
                    break;
                }
            }
            if (!dividable) {
                return false;
            }
        }

        return true;
    }
}
