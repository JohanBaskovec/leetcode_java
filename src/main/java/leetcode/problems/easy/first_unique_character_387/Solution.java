package leetcode.problems.easy.first_unique_character_387;

class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        char[] charArray = s.toCharArray();
        for  (int i = 0; i < charArray.length; i++) {
            count[charArray[i] - 'a']++;
        }
        for(int i = 0; i < charArray.length; i++) {
            if(count[charArray[i] - 'a'] == 1) return i;
        }
        return -1;
    }
}
