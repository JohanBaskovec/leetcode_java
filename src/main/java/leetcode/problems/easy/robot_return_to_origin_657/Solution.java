package leetcode.problems.easy.robot_return_to_origin_657;

public class Solution {
    public boolean judgeCircle(String moves) {
        char[] chars = moves.toCharArray();
        int x = 0;
        int y = 0;
        for  (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'U':
                    y--;
                    break;
                case 'D':
                    y++;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
