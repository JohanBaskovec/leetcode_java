package leetcode.problems.medium.maximum_matching_of_players_with_trainers_2410;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void matchPlayersAndTrainers() {
        Solution solution = new Solution();
        assertEquals(2, solution.matchPlayersAndTrainers(new int[]{4,7,9}, new int[]{8,2,5,8}));
        assertEquals(1, solution.matchPlayersAndTrainers(new int[]{1,1,1}, new int[]{10}));
        assertEquals(2, solution.matchPlayersAndTrainers(new int[]{1, 1000000000}, new int[]{1000000000, 1}));
        assertEquals(3, solution.matchPlayersAndTrainers(new int[]{1,1,1}, new int[]{1,1,1}));
        assertEquals(3, solution.matchPlayersAndTrainers(new int[]{1,1,1}, new int[]{2,2,2}));
        assertEquals(3, solution.matchPlayersAndTrainers(new int[]{1,1,1}, new int[]{1,2,3}));
        assertEquals(3, solution.matchPlayersAndTrainers(new int[]{1,1,1}, new int[]{1,2,3,4}));
        assertEquals(1, solution.matchPlayersAndTrainers(new int[]{1}, new int[]{1,2,3,4}));
        assertEquals(0, solution.matchPlayersAndTrainers(new int[]{5}, new int[]{1,2,3,4}));
    }
}