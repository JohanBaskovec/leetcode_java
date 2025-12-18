package leetcode.problems.find_the_difference_389;

class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        for  (int i = 0; i < charArrayS.length; i++) {
            count[charArrayS[i] - 'a']++;
            count[charArrayT[i] - 'a']--;
        }
        count[charArrayT[charArrayT.length - 1] - 'a']--;
        for (int i = 0; i < count.length; i++) {
            if (count[i] < 0) {
                return (char)(i + 'a');
            }
        }
        return 0;
    }
}
