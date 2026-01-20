package leetcode.problems.easy.delete_columns_to_make_sorted_944;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void minDeletionSize() {
        Solution s = new Solution();
        assertEquals(1, s.minDeletionSize(new String[]{"cba","daf","ghi"}));
        assertEquals(0, s.minDeletionSize(new String[]{"a","b"}));
        assertEquals(3, s.minDeletionSize(new String[]{"zyx","wvu","tsr"}));

    }
}