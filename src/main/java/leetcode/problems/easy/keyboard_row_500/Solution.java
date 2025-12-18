package leetcode.problems.easy.keyboard_row_500;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findWords(String[] words) {
        List<String> retList = new ArrayList<String>();
        for (String word : words) {
            boolean row0 = true;
            boolean row1 = true;
            boolean row2 = true;
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                switch (c) {
                    case 'Q':
                    case 'q':
                    case 'W':
                    case 'w':
                    case 'E':
                    case 'e':
                    case 'R':
                    case 'r':
                    case 'T':
                    case 't':
                    case 'U':
                    case 'u':
                    case 'I':
                    case 'i':
                    case 'O':
                    case 'o':
                    case 'P':
                    case 'p':
                        row1 = false;
                        row2 = false;
                        break;


                    case 'A':
                    case 'a':
                    case 'S':
                    case 's':
                    case 'D':
                    case 'd':
                    case 'F':
                    case 'f':
                    case 'G':
                    case 'g':
                    case 'H':
                    case 'h':
                    case 'J':
                    case 'j':
                    case 'K':
                    case 'k':
                    case 'L':
                    case 'l':
                        row0 = false;
                        row2 = false;
                        break;
                    case 'Z':
                    case 'z':
                    case 'X':
                    case 'x':
                    case 'C':
                    case 'c':
                    case 'V':
                    case 'v':
                    case 'B':
                    case 'b':
                    case 'N':
                    case 'n':
                    case 'M':
                    case 'm':
                        row0 = false;
                        row1 = false;
                        break;
                }
                if (!row0 && !row1 && !row2) {
                    break;
                }

            }
            if (row0 || row1 || row2) {
                retList.add(word);
            }
        }
        String[] retArray = new String[retList.size()];
        retArray = retList.toArray(retArray);
        return retArray;
    }
}
