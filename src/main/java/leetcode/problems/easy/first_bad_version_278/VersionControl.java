package leetcode.problems.easy.first_bad_version_278;

public class VersionControl {
    private final int firstBad;

    public VersionControl(int firstBad) {
        this.firstBad = firstBad;
    }

    boolean isBadVersion(int n) {
        return firstBad <= n;
    }
}
