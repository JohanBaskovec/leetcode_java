package leetcode.problems.easy.range_sum_query_303;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumArrayTest {

    @Test
    void sumRange() {
        NumArray numArray = new NumArray(new int[] {1,2,3,4,5});
        assertEquals(9, numArray.sumRange(3,4));

    }
}