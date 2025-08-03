package leetcode.problems.hard.regular_expression_matching_10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public boolean isMatch(String s, String p) {

        String newPattern = "^" + p + "$";
        Pattern pattern = Pattern.compile(newPattern);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
