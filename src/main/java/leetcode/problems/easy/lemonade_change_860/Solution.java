package leetcode.problems.easy.lemonade_change_860;

public class Solution {
    public boolean lemonadeChange(int[] bills) {
        int nFiveBills = 0;
        int nTenBills = 0;
        for (int bill : bills){
            if (bill == 5) {
                nFiveBills++;
            } else if (bill == 10) {
                nTenBills++;
                nFiveBills--;
                if (nFiveBills < 0) {
                    return false;
                }
            } else if (bill == 20) {
                if (nTenBills == 0) {
                    nFiveBills-=3;
                } else {
                    nFiveBills--;
                    nTenBills--;
                }
                if (nFiveBills < 0 || nTenBills < 0) {
                    return false;
                }
            }
        }
        return true;

    }
}
