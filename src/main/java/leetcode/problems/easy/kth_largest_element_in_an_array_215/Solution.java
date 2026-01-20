package leetcode.problems.easy.kth_largest_element_in_an_array_215;

import java.util.PriorityQueue;

@SuppressWarnings("CommentedOutCode")
public class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.offer(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
/*
    // This is actually the fastest solution, but the
    // instructions asks "Can you solve it without sorting?"
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
*/
}
