package leetcode.problems.easy.binary_gap_868;

public class Solution {
    public int binaryGap(int n) {
        int lastOneIndex = -1;
        int index = 0;
        int maxGap = 0;
        while (n != 0) {
            int binaryDigit = n & 1;
            if (binaryDigit == 0) {
            } else {
                if (lastOneIndex != -1) {
                    int gap = index - lastOneIndex;
                    if (gap > maxGap) {
                        maxGap = gap;
                    }
                }
                lastOneIndex = index;
            }
            index++;
            n /= 2;
        }
        return maxGap;
    }
}
