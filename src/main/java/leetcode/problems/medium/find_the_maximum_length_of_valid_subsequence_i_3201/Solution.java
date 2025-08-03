package leetcode.problems.medium.find_the_maximum_length_of_valid_subsequence_i_3201;

public class Solution {
    public int maximumLength(int[] nums) {
        /*
            A  subsequence sub of nums with length x is called valid if it satisfies:
            (sub[0] + sub[1]) % 2 == (sub[1] + sub[2]) % 2 == ... == (sub[x - 2] + sub[x - 1]) % 2.

            Examples of subsequences that satisfies the criteria:
            2 4 6 8 4: all even numbers (sub[i] + sub[i+1]) % 2 is equal to 0
            1 3 7 3 11: all odd numbers  (sub[i] + sub[i+1]) % 2 is equal to 0
            1 2 3 8 5: alternate odd and even numbers (sub[i] + sub[i+1]) % 2 is equal to 1
            2 3 8 5 4: alternate even and odd numbers (sub[i] + sub[i+1]) % 2 is equal to 1
         */
        if (nums.length == 2) {
            return 2;
        }

        int lengthOddEvenSequence = 0;
        boolean oddEvenSequenceLookingForEven = false;
        int lengthEvenSequence = 0;
        int lengthEvenOddSequence = 0;
        boolean evenOddSequenceLookingForEven = true;
        for (int num : nums) {
            boolean isEven = (num & 1) == 0;
            if (isEven) {
                lengthEvenSequence++;
                if (evenOddSequenceLookingForEven) {
                    lengthEvenOddSequence++;
                    evenOddSequenceLookingForEven = false;
                }
                if (oddEvenSequenceLookingForEven) {
                    lengthOddEvenSequence++;
                    oddEvenSequenceLookingForEven = false;
                }
            } else {
                if (!evenOddSequenceLookingForEven) {
                    lengthEvenOddSequence++;
                    evenOddSequenceLookingForEven = true;
                }
                if (!oddEvenSequenceLookingForEven) {
                    lengthOddEvenSequence++;
                    oddEvenSequenceLookingForEven = true;
                }
            }
        }
        int lengthOddSequence = nums.length - lengthEvenSequence;

        return Math.max(Math.max(lengthOddSequence, lengthOddEvenSequence), Math.max(lengthEvenOddSequence, lengthEvenSequence));
    }
}
