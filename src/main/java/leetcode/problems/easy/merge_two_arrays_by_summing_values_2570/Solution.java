package leetcode.problems.easy.merge_two_arrays_by_summing_values_2570;

import java.util.*;

public class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int nVals = 0;
        int[] data = new int[1001];

        int[][] longestArray = nums2;
        int[][] shortestArray = nums1;
        if (nums1.length > nums2.length) {
            longestArray = nums1;
            shortestArray = nums2;
        }

        int i = 0;
        for (; i < shortestArray.length; i++) {
            if (data[shortestArray[i][0]] == 0) {
                nVals++;
            }
            data[shortestArray[i][0]] += shortestArray[i][1];

            if (data[longestArray[i][0]] == 0) {
                nVals++;
            }
            data[longestArray[i][0]] += longestArray[i][1];
        }

        for (; i < longestArray.length; i++) {
            if (data[longestArray[i][0]] == 0) {
                nVals++;
            }
            data[longestArray[i][0]] += longestArray[i][1];
        }

        int[][] ret =  new int[nVals][2];
        int iRet = 0;
        for (int j = 0; j < data.length; j++) {
            if (data[j] != 0) {
                ret[iRet][0] = j;
                ret[iRet][1] = data[j];
                iRet++;
            }
        }
        return ret;
    }

}
