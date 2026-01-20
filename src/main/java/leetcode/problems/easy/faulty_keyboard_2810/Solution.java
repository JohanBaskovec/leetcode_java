package leetcode.problems.easy.faulty_keyboard_2810;

public class Solution {
    public String finalString(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);

            if (c == 'i') {
                sb.reverse();
            } else {
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}
