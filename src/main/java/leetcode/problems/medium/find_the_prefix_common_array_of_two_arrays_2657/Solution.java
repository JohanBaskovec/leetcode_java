package leetcode.problems.medium.find_the_prefix_common_array_of_two_arrays_2657;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        boolean[] uniqueNumbers = new boolean[A.length + 1];
        int[] C = new int[A.length];
        int prevC = 0;
        for (int iC = 0 ; iC < C.length ; iC++) {
            if (uniqueNumbers[A[iC]]) {
                prevC++;
            } else {
                uniqueNumbers[A[iC]] = true;
            }
            if (uniqueNumbers[B[iC]]) {
                prevC++;
            } else {
                uniqueNumbers[B[iC]] = true;
            }
            C[iC] = prevC;
        }
        return C;
    }
}
