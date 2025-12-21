package leetcode.problems.easy.rings_and_rods_2103;

public class Solution {
    public int countPoints(String rings) {
        boolean[] hasG = new boolean[10];
        boolean[] hasB = new boolean[10];
        boolean[] hasR = new boolean[10];
        for (int i = 0; i < rings.length(); i+=2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';
            switch (color) {
                case 'G':
                    hasG[rod] = true;
                    break;
                case 'B':
                    hasB[rod] = true;
                    break;
                case 'R':
                    hasR[rod] = true;
                    break;
            }
        }
        int nHasAllRings = 0;
        for (int i = 0; i < 10; i++) {
            if (hasG[i] && hasB[i] && hasR[i]) {
                nHasAllRings++;
            }
        }
        return nHasAllRings;


    }
}
