package learn;

/**
 * 求多次买卖股票的最大值
 */
@SuppressWarnings("all")
public class MaxProfitTwo {

    // 思路：将数组看成一个曲线图 找到其中的拐点 即峰谷
    /*
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int len = prices.length;
        int maxProfit = 0;
        int valley = prices[0];
        int peek = prices[0];
        int i = 0;
        while (i < len - 1) {
            while (i < len - 1 && prices[i] > prices[i + 1]) {
                i++;
            }
            valley = prices[i];
            while (i < len - 1 && prices[i] < prices[i + 1]) {
                i++;
            }
            peek = prices[i];
            maxProfit += (peek - valley);
        }
        return maxProfit;
    }
     */

    // 思路：峰谷之间可拆分为连续的小峰谷
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int len = prices.length;
        int maxProfit = 0;
        for (int i = 1; i < len; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += (prices[i] - prices[i - 1]);
            }
        }
        return maxProfit;
    }

}
