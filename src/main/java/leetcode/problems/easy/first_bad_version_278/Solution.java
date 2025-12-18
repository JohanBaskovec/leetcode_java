package leetcode.problems.easy.first_bad_version_278;

import java.math.BigInteger;

public class Solution extends VersionControl {
    public Solution(int firstBad) {
        super(firstBad);
    }

    public int firstBadVersion(int n) {
        if (n == 1) {
            return 1;
        }
        int lowestBad = n;
        int low = 1;
        int high = n;
        while (true) {
            int mid = (int)(((long)low + (long)high) / 2);;
            boolean isBad = isBadVersion(mid);
            if (isBad) {
                if (mid < lowestBad) {
                    lowestBad = mid;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            if (low < 0 || high < 0 || low > high) {
                return lowestBad;
            }
        }
    }
}
