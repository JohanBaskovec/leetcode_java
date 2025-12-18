package leetcode.problems.easy.license_key_formatting_482;

class Solution {
    public String licenseKeyFormatting(String s, int k) {
        char[] result = new char[s.length() * 2];
        int resultIndex = result.length - 1;
        char[] chars = s.toCharArray();
        int currentBlockLength = 0;
        boolean foundFirst = false;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] != '-') {
                if (foundFirst && currentBlockLength == 0) {
                    result[resultIndex] = '-';
                    resultIndex--;
                }
                foundFirst = true;
                result[resultIndex] = Character.toUpperCase(chars[i]);
                currentBlockLength++;
                resultIndex--;
                if (currentBlockLength == k) {
                    currentBlockLength = 0;
                }
            }
        }
        return new String(result, resultIndex + 1, result.length - resultIndex - 1);
    }
}
