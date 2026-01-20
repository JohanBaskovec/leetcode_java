package leetcode.problems.easy.defuse_the_bomb_1652;

public class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] decrypted = new int[code.length];
        if (k < 0) {

            int sum = 0;
            int j = 0;
            int index = code.length + k;
            int firstIndex = index;
            while (j < -k) {
                if (index == code.length) {
                    index = 0;
                }
                sum += code[index];
                j++;
                index++;
            }
            decrypted[0] = sum;
            for (int i = 1; i < code.length; i++) {
                if (firstIndex == code.length) {
                    firstIndex = 0;
                }
                sum -= code[firstIndex];
                firstIndex++;
                if (index == code.length) {
                    index = 0;
                }
                sum += code[index];
                index++;
                decrypted[i] = sum;
            }

        } else if (k > 0) {
            int sum = 0;
            int j = 0;
            int index = 1;
            while (j < k) {
                if (index == code.length) {
                    index = 0;
                }
                sum += code[index];
                j++;
                index++;
            }
            decrypted[0] = sum;
            for (int i = 1; i < code.length; i++) {
                sum -= code[i];
                if (index == code.length) {
                    index = 0;
                }
                sum += code[index];
                index++;
                decrypted[i] = sum;
            }
        }
        return decrypted;
    }
}
