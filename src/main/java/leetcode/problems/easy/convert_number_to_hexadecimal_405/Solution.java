package leetcode.problems.easy.convert_number_to_hexadecimal_405;

public class Solution {
    private final char[] intToCharMap = new char[]{
            '0', '1',  '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f'
    };

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        long longNum = num;
        if (longNum < 0) {
            longNum = 4294967295L + num + 1;
        }
        char[] ret = new char[32];
        int iRet = 31;
        while (longNum > 0) {
            int mod = (int) (longNum % 16);
            ret[iRet] = intToCharMap[mod];
            iRet--;
            longNum /= 16;
        }

        return new String(ret, iRet + 1, ret.length - iRet - 1);
    }
}
