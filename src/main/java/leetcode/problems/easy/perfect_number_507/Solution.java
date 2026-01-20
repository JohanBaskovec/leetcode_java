package leetcode.problems.easy.perfect_number_507;

public class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        int max = (int) Math.sqrt(num);
        int sum = 1;
        for (int i = 2 ; i <= max ; i++) {
            if (num % i == 0) {
                sum += i;
                sum += num / i;
            }
        }
        return sum == num;
    }
}
