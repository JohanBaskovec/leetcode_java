package leetcode.problems.easy.find_smalles_letter_greater_than_target_744;

import java.util.Arrays;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters[letters.length - 1] <= target) {
            return letters[0];
        }
        int index = Arrays.binarySearch(letters, target);
        if (index < 0) {
            return letters[(-(index + 1))];
        } else {
            while (letters[index] == target) {
                index++;
            }
            return letters[index];
        }
    }
}
