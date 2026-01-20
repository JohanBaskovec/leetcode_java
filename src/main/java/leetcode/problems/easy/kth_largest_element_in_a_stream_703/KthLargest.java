package leetcode.problems.easy.kth_largest_element_in_a_stream_703;

import java.util.*;

public class KthLargest {
    int k;
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        for(int num: nums){
            this.queue.offer(num);
        }
    }

    public int add(int val) {
        this.queue.offer(val);
        while(this.queue.size() > k) {
            queue.poll();
        }
        return this.queue.peek();
    }
/*
    Extremely slow: Time Limit Exceeded

    private final int k;
    TreeMap<Integer, Integer> map = new TreeMap<>();
    int size = 0;
    public KthLargest(int k, int[] nums) {
        for (int n : nums) {
            map.merge(n, 1, Integer::sum);
        }
        this.k = k;;
    }
    public int add(int x) {
        map.merge(x, 1, Integer::sum);
        size++;

        int count = 0;
        for (var entry : map.descendingMap().entrySet()) {
            count += entry.getValue();
            if (count >= k) {
                return entry.getKey();
            }
        }
        return -1;
    }
*/
/*
    Slow (36ms, beats 5.45%)
    private final int k;
    List<Integer> sorted = new ArrayList<Integer>();
    public KthLargest(int k, int[] nums) {
        for (int n : nums) {
            sorted.add(n);
        }
        Collections.sort(sorted);
        this.k = k;;
    }
    public int add(int x) {
        int pos = Collections.binarySearch(sorted, x);
        if (pos < 0) {
            pos = -pos - 1;
        }
        sorted.add(pos, x);
        return sorted.get(sorted.size() - k);
    }
*/

/*
    Very slow solution (125 ms, beats 5%)
    private final int k;
    int[] sorted;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        sorted = new int[k + 1];
        sorted[0] = Integer.MIN_VALUE;
        sorted[1] = Integer.MIN_VALUE;
        Arrays.sort(nums);
        int j = sorted.length - 1;
        for (int i = nums.length - 1; i >= 0 && j >= 0; i--, j--) {
            sorted[j] = nums[i];
        }
    }

    public int add(int val) {
        int insertionIndex = Arrays.binarySearch(sorted, val);
        if (insertionIndex < 0) {
            insertionIndex = -(insertionIndex + 1);
        }
        int kthLargestIndex = sorted.length - k;
        if (insertionIndex >= kthLargestIndex) {
            for (int i = 0; i < insertionIndex - 1; i++) {
                sorted[i] = sorted[i + 1];
            }
            sorted[insertionIndex - 1] = val;
        }
        return sorted[sorted.length - k];
    }
*/
}
