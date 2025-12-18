package leetcode.problems.easy.add_strings_415;

public class Solution {
    public String addStrings(String num1, String num2) {
        if (num1.isEmpty()) {
            return num2;
        }
        if (num2.isEmpty()) {
            return num1;
        }
        int longest = Math.max(num1.length(), num2.length());
        char[] result = new char[longest + 1];
        int resultIndex = result.length - 1;
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();
        int i = num1.length() - 1, j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int left = 0;
            int right = 0;
            if (i >= 0) {
                left = num1Chars[i] - '0';
            }
            if (j >= 0) {
                right = num2Chars[j] - '0';
            }
            int sum = left + right + carry;
            if (sum > 9) {
                carry = 1;
            } else {
                carry = 0;
            }
            int digit = sum % 10;
            result[resultIndex] = (char)('0' + digit);
            resultIndex--;
            i--;
            j--;
        }
        if (carry == 1) {
            result[resultIndex] = '1';
            return new String(result);
        } else if (carry == 0) {
            return new String(result, 1, result.length - 1);
        }
        return "0";
    }
}
