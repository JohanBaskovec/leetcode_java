package leetcode.problems.easy.construct_the_rectangle_492;

class Solution {
    public int[] constructRectangle(int area) {
        int w = (int)Math.sqrt(area);

        for (; w > 0 ; w--) {
            int mod = area % w;
            if (mod == 0) {
                int l = area / w;
                return new int[]{l, w };
            }
        }
        return new int[]{0, 0};
    }
}
