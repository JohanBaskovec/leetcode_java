package leetcode.problems.easy.fibonacci_number_509;

class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n, 2, 0, 1);
    }

    public int fib(int n, int curr, int prev0, int prev1) {
        if (n == curr) {
            return prev0 + prev1;
        }

        return fib(n, curr + 1, prev1, prev1 + prev0);
    }
}
