package leetcode.problems.easy.summary_range_228;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void summaryRanges() {
        Solution solution = new Solution();
        assertEquals(List.of("1"), solution.summaryRanges(new int[]{1}));
        assertEquals(List.of("1->2"), solution.summaryRanges(new int[]{1, 2}));
        assertEquals(List.of("1", "3"), solution.summaryRanges(new int[]{1, 3}));
        assertEquals(List.of("1->3"), solution.summaryRanges(new int[]{1, 2, 3}));
        assertEquals(List.of("1->4"), solution.summaryRanges(new int[]{1, 2, 3, 4}));
        assertEquals(List.of("1", "3->4"), solution.summaryRanges(new int[]{1, 3, 4}));
        assertEquals(List.of("1", "3->4", "8->12"), solution.summaryRanges(new int[]{1, 3, 4, 8, 9, 10, 11, 12}));
        assertEquals(List.of("-2147483648","0","2->4","6","8->9"), solution.summaryRanges(new int[]{-2147483648,0,2,3,4,6,8,9}));

    }
}