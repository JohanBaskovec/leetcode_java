package leetcode.problems.easy.best_time_to_buy_and_sell_stock_121;

class Solution {
    public int maxProfit(int[] prices) {
/*
        int[][] daysAndPrices = new int[prices.length][2];
        for (int iDay = 0 ; iDay < prices.length ; iDay++) {
            daysAndPrices[iDay] = new int[]{iDay, prices[iDay]};
        }
        Arrays.sort(daysAndPrices, Comparator.comparingInt(a -> a[1]));
        int iDay1 = 0;
        int iDay2 = daysAndPrices.length - 1;
        int maxProfit = 0;
        while (iDay1 < daysAndPrices.length) {
            iDay2 = daysAndPrices.length - 1;
            int profit = 0;
            int[] day1 = daysAndPrices[iDay1];
            int[] day2 = daysAndPrices[iDay2];
            while (iDay2 >= 0 && profit == 0) {
                day2 = daysAndPrices[iDay2];
                if (day2[0] > day1[0]) {
                    profit = day2[1] - day1[1];
                }
                iDay2--;
            }
            if (profit > maxProfit) {
                maxProfit = profit;
            }
            iDay1++;
        }
*/
        int lowest = prices[0];
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            int price = prices[i];
            if (price < lowest) {
                lowest = prices[i];
            }
            int profit = price - lowest;
            if (price - lowest > maxProfit) {
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
