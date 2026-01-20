package leetcode.problems.easy.decrypt_string_from_alphabet_to_integer_mapping_1309;

public class Solution {
    public String freqAlphabets(String s) {
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder(s.length());
        int i = 0;
        while (i < chars.length - 2) {
            if (chars[i + 2] == '#') {
                int index = (chars[i] - 48) * 10 + (chars[i + 1] - 48);
                char character = (char) (96 + index);
                sb.append(character);
                i+=3;
            } else {
                char character = (char)(chars[i] + 48);
                sb.append(character);
                i++;
            }
        }
        while (i < chars.length) {
            char character = (char)(chars[i] + 48);
            sb.append(character);
            i++;
        }

        return sb.toString();


    }
}
