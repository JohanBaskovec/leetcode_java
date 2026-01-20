package leetcode.problems.easy.divide_a_string_into_groups_of_size_k_2138;

class Solution {
    public String[] divideString(String s, int k, char fill) {
        char[] chars =  s.toCharArray();
        int resLength = chars.length / k;
        if (chars.length % k != 0) {
            resLength++;
        }

        String[] res = new String[resLength];
        int iRes = 0;
        int iString = 0;
        for (; iString + k <= chars.length; iString+=k) {
            res[iRes] = s.substring(iString,iString+k);
            iRes++;
        }
        if (iString != chars.length) {
            int nCharsLeft = k - (chars.length - iString);
            StringBuilder sb = new StringBuilder(s.substring(iString,chars.length));
            for (int i = 0 ; i < nCharsLeft ; i++) {
                sb.append(fill);
            }
            res[iRes] = sb.toString();
        }
        return res;
    }
}
