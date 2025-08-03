package leetcode.problems.easy.pascal_triangle_II_119;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            return List.of(1);
        }
        if (rowIndex == 1) {
            return List.of(1, 1);
        }

        int[] previousRow = new int[]{1, 1};
        for (int iRow = 2 ; iRow <= rowIndex ; iRow++) {
            int numsPerRow = iRow + 1;
            int[] currentRow = new int[numsPerRow];
            currentRow[0] = 1;
            currentRow[numsPerRow - 1] = 1;
            int iMidRow = numsPerRow / 2;
            int iRowNumLeft = iMidRow - 1;
            if (numsPerRow % 2 == 0) {
                iMidRow = iMidRow - 1;
                iRowNumLeft = iMidRow;
            }
            int iRowNum = 1;
            for (; iRowNum <= iMidRow; iRowNum++) {
                int val = previousRow[iRowNum - 1] + previousRow[iRowNum];
                currentRow[iRowNum] = val;
            }
            for (; iRowNum < numsPerRow; iRowNum++) {
                currentRow[iRowNum] = currentRow[iRowNumLeft];
                iRowNumLeft--;
            }
            previousRow = currentRow;
        }
        List<Integer> ret = new ArrayList<>();
        for (int j : previousRow) {
            ret.add(j);
        }
        return ret;
    }
}
