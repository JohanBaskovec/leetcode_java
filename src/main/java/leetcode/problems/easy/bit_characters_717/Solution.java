package leetcode.problems.easy.bit_characters_717;

class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        while (i < bits.length) {
           if (bits[i] == 1) {
               // character is either 10 or 11, we skip to next character
               i += 2;
               if (i == bits.length) {
                   return false;
               }
           } else {
               // character is 0, we skip to next character
               i += 1;
               if (i == bits.length) {
                   return true;
               }
           }
        }
        return false;
    }
}
