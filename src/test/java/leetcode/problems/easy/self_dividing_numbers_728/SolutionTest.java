package leetcode.problems.easy.self_dividing_numbers_728;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void selfDividingNumbers() {
        Solution s = new Solution();
        assertEquals(List.of(1,2,3,4,5,6,7,8,9,11,12,15,22), s.selfDividingNumbers(1, 22));
    }
}