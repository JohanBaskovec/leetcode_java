package leetcode.problems.medium.threesum_closest_16;

import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        int closestDiff = Math.abs(closestSum - target);
        for (int i = 0; i < nums.length; i++) {
            // so we skip identical triplets
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            while (j < nums.length - 1) {
                int sum = nums[i] + nums[j];
                int diff = target - sum;
                int indexBestNumber = Arrays.binarySearch(nums, j + 1, nums.length, diff);
                if (indexBestNumber < 0) {
                    // didn't find a match, indexBestNumber is (-(insertion point)-1),
                    // where insertion point is the index of the first element greater than diff
                    int insertionPoint = -indexBestNumber -1;
                    if (insertionPoint == nums.length) {
                        // all of the elements were lower than diff
                        // we should only try the last element
                        sum += nums[nums.length - 1];
                    } else {
                        if (insertionPoint - 1 > j) {
                            int leftNum = nums[insertionPoint - 1];
                            int rightNum = nums[insertionPoint];
                            int diffWithRight = Math.abs(diff - rightNum);
                            int diffWithLeft = Math.abs(diff - leftNum);
                            if (diffWithLeft < diffWithRight) {
                                sum += leftNum;
                            } else {
                                sum += rightNum;
                            }
                        } else {
                            int rightNum = nums[insertionPoint];
                            sum += rightNum;
                        }
                    }

                    int diffSum = Math.abs(sum - target);
                    if (diffSum < closestDiff) {
                        closestSum = sum;
                        closestDiff = diffSum;
                    }
                } else {
                    // found a match
                    return target;
                }
                while (j < nums.length - 1 && nums[j + 1] == nums[j]) {
                    j++;
                }
                j++;
            }

        }
        return closestSum;
    }
}
