package leetcode.problems.hard.median_of_two_sorted_arrays_4;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 1 && nums2.length == 0) {
            return nums1[0];
        }
        if (nums1.length == 0 && nums2.length == 1) {
            return nums2[0];
        }
        int totalLength = nums1.length + nums2.length;

        int i = 0;
        int iNums1 = 0;
        int iNums2 = 0;
        int iMedian = totalLength / 2;
        int currentNumber = -1;
        int previousNumber = -1;
        while (i <= iMedian) {
            previousNumber = currentNumber;
            if (iNums1 >= nums1.length) {
                currentNumber = nums2[iNums2++];
            } else if (iNums2 >= nums2.length) {
                currentNumber = nums1[iNums1++];
            } else {
                int num1 = nums1[iNums1];
                int num2 = nums2[iNums2];
                if (num1 < num2) {
                    currentNumber = num1;
                    iNums1++;
                } else {
                    currentNumber = num2;
                    iNums2++;
                }
            }
            i++;
        }
        boolean exactMedian = totalLength % 2 == 1;
        if (exactMedian) {
            return currentNumber;
        } else {
            return (previousNumber + currentNumber) / 2.0;
        }
    }
}
