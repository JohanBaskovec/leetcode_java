package leetcode.problems.medium.find_the_maximum_length_of_valid_subsequence_ii_3202;

public class Solution {
    public int maximumLength(int[] nums, int k) {
        int longest = 0;
        //int[] longestSequences = new int[k];
        int firstLeft = 0;
        while (firstLeft < nums.length - 1) {
            int firstRight = firstLeft + 1;

            while (firstRight < nums.length) {
                if (nums.length - firstRight < longest) {
                    break;
                }
                // 4 2 5 6 9 3 5 6
                int targetRemainder = (nums[firstLeft] + nums[firstRight]) % k;
/*
                if (longestSequences[targetRemainder] != 0) {
                    firstRight++;
                    continue;
                }
*/
                int length = 1;
                int currentLeft = firstRight;
                int currentRight = currentLeft + 1;
                while (currentRight < nums.length) {
                    int remainder = (nums[currentLeft] + nums[currentRight]) % k;
                    if (remainder == targetRemainder) {
                        length++;
                        currentLeft = currentRight;
                        currentRight = currentLeft + 1;
                    } else {
                        currentRight++;
                    }
                }
                if (length > longest) {
                    longest = length;
                }
                //longestSequences[targetRemainder] = length;
                firstRight++;
            }
            firstLeft++;
        }
        return longest + 1;
    }
}
