package leetcode.problems.easy.check_if_all_as_appear_before_all_bs_2124;

public class Solution {
    public boolean checkString(String s) {
        boolean foundB = false;
        for (int i = 0; i < s.length(); i++) {
            char c =  s.charAt(i);
            if (foundB) {
                if (c == 'a') {
                    return false;
                }
            } else if (c == 'b') {
                foundB = true;
            }
        }
        return true;
    }
}
