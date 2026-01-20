package leetcode.problems.easy.student_attendance_record_i_551;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void checkRecord() {
        Solution s = new Solution();
        assertTrue(s.checkRecord("PPPPPPP"));
        assertTrue(s.checkRecord("PPALLP"));
        assertFalse(s.checkRecord("PPALLL"));
        assertTrue(s.checkRecord("AL"));
    }
}