package leetcode.problems.easy.ransom_note_383;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (int i = 0; i < ransomNote.length(); i++) {
            count[ransomNote.charAt(i) - 'a']--;
        }
        for (int j = 0; j < magazine.length(); j++) {
            count[magazine.charAt(j) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] < 0) {
                return false;
            }
        }
        return true;
    }
}
