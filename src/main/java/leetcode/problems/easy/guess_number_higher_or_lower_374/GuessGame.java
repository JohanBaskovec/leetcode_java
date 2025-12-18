package leetcode.problems.easy.guess_number_higher_or_lower_374;

public class GuessGame {
    private final int number;

    public GuessGame(int number) {
        this.number = number;
    }

    int guess(int guessedNumber) {
        if (guessedNumber > number) {
            return -1;
        } else if (guessedNumber < number) {
            return 1;
        } else {
            return 0;
        }
    }
}
