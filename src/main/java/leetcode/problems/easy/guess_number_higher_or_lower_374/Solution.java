package leetcode.problems.easy.guess_number_higher_or_lower_374;

public class Solution extends GuessGame {
    public Solution(int number) {
        super(number);
    }

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (true) {
            int currentGuess = (int)(((long)low + (long)high) / 2L);
            int result = guess(currentGuess);
            if (result == 0) {
                return currentGuess;
            } else if (result == 1) {
                low = currentGuess + 1;
            } else {
                high = currentGuess - 1;
            }
        }
    }
}
