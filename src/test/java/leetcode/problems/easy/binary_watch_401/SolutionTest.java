package leetcode.problems.easy.binary_watch_401;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void readBinaryWatch() {
        Solution solution = new Solution();
        assertEquals(List.of("0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"), solution.readBinaryWatch(1));
        assertEquals(List.of(),  solution.readBinaryWatch(9));
    }
}