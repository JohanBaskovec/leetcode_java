package leetcode.problems.easy.guess_number_higher_or_lower_374;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    public void guessNumber() {
        assertEquals(1, new Solution(1).guessNumber(1000));
        assertEquals(2, new Solution(2).guessNumber(10000));
        assertEquals(3, new Solution(3).guessNumber(5));
        assertEquals(10000, new Solution(10000).guessNumber(10000));
        assertEquals(356547, new Solution(356547).guessNumber(1000000));
        assertEquals(1702766719, new Solution(1702766719).guessNumber(2126753390));
    }

}