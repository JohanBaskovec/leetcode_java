package leetcode.problems.easy.distribute_candies_575;

public class Solution {
    public int distributeCandies(int[] candyType) {
        boolean[] hasType = new boolean[200001];
        int nTypes = 0;
        for (int i = 0; i < candyType.length; i++) {
            int typeIndex = candyType[i] + 100000;
            if (!hasType[typeIndex]) {
                nTypes++;
                hasType[typeIndex] = true;
            }
        }
        return Math.min(candyType.length / 2, nTypes);
    }
}
