package leetcode.problems.easy.rectangle_overlap_836;

public class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int bottomLeftX0 = rec1[0];
        int bottomLeftY0 = rec1[1];
        int topRightX0 = rec1[2];
        int topRightY0 = rec1[3];

        int bottomLeftX1 = rec2[0];
        int bottomLeftY1 = rec2[1];
        int topRightX1 = rec2[2];
        int topRightY1 = rec2[3];

        //      rec2 is on the right of rec1  rec2 is on the left of rec1  rec2 is bellow rec1          rec2 is above rec1
        return !(bottomLeftX1 >= topRightX0 || topRightX1 <= bottomLeftX0 || topRightY1 <= bottomLeftY0 || bottomLeftY1 >= topRightY0);
    }
}
