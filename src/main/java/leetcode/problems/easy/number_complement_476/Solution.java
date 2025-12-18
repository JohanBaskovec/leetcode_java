package leetcode.problems.easy.number_complement_476;

public class Solution {
    public int findComplement(int num) {
        int ret = 0;
        int mask = 1 << 30;
        boolean foundFirstBit = false;
        while (mask != 0) {
            if ((mask & num) == 0) {
                if (foundFirstBit) {
                    ret |= mask;
                }
            } else {
                foundFirstBit = true;
            }
            mask >>= 1;
        }
        return ret;
    }
}
