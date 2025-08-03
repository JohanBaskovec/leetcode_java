package leetcode.problems.medium.maximum_matching_of_players_with_trainers_2410;

import java.util.Arrays;

class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int matches = 0;
        int iPlayer = players.length - 1;
        int iTrainer = trainers.length - 1;
        while (true) {

            while (players[iPlayer] > trainers[iTrainer]) {
                iPlayer--;
                if (iPlayer < 0) {
                    return matches;
                }
            }
            matches++;
            iPlayer--;
            iTrainer--;
            if (iPlayer < 0 || iTrainer < 0) {
                return matches;
            }
        }
    }
}
