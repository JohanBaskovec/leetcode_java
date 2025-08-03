package leetcode.problems.easy.best_time_to_buy_and_sell_stock_121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void maxProfit() {
        Solution solution = new Solution();
        assertEquals(5, solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}