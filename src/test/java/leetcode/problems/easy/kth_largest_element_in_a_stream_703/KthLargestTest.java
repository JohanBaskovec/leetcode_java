package leetcode.problems.easy.kth_largest_element_in_a_stream_703;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestTest {

    @Test
    void add() {
        KthLargest kthLargest0 = new KthLargest(3, new int[]{4, 5, 8, 2});
        assertEquals(4, kthLargest0.add(2));
        assertEquals(4, kthLargest0.add(1));
        assertEquals(5, kthLargest0.add(7));
        assertEquals(7, kthLargest0.add(7));
        assertEquals(7, kthLargest0.add(8));

        KthLargest kthLargest1 = new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3});
        assertEquals(7, kthLargest1.add(2));
        assertEquals(7, kthLargest1.add(10));
        assertEquals(7, kthLargest1.add(9));
        assertEquals(8, kthLargest1.add(9));

        KthLargest kthLargest2 = new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3});
        assertEquals(7, kthLargest2.add(2));
        assertEquals(7, kthLargest2.add(10));
        assertEquals(7, kthLargest2.add(9));
        assertEquals(8, kthLargest2.add(9));

        KthLargest kthLargest3 = new KthLargest(1, new int[]{});
        assertEquals(-3, kthLargest3.add(-3));
        assertEquals(-2, kthLargest3.add(-2));
        assertEquals(-2, kthLargest3.add(-4));
        assertEquals(0, kthLargest3.add(0));
        assertEquals(4, kthLargest3.add(4));
    }
}