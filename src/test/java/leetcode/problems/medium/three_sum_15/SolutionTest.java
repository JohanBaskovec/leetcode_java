package leetcode.problems.medium.three_sum_15;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void threeSum() {
        Solution solution = new Solution();
        assertEquals(List.of(List.of(-1,-1,2),List.of(-1,0,1)), solution.threeSum(new int[]{-1,0,1,2,-1,-4}));
        assertEquals(List.of( List.of(-1,-1,2), List.of(-1,0,1) ), solution.threeSum(new int[]{-4,-1,-1,-1,0,1,2}));
        assertEquals(List.of( List.of(0,0,0) ), solution.threeSum(new int[]{0,0,0}));

    }
}