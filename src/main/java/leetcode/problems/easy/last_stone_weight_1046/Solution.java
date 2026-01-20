package leetcode.problems.easy.last_stone_weight_1046;

import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int stone : stones) {
            pq.add(stone);
        }

        while (pq.size() > 1) {
            int highest = pq.poll();
            int secondHighest = pq.poll();
            if (highest != secondHighest) {
                int result = highest - secondHighest;
                pq.add(result);
            }
        }
        if (pq.size() == 1) {
            return pq.poll();
        } else {
            return 0;
        }
    }
}
