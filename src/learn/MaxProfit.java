package learn;

/**
 * 例：
 * 输入: [7,1,5,3,6,4]
 * 输出: 5
 * 解释: 在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
 *      注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格。
 */
@SuppressWarnings("all")
public class MaxProfit {

    // 思路：通过左指针和右指针比较买入、卖出的价格，并记录最大差
    // 暴力求解 全部遍历 时间复杂度为O(n`2) 不推荐
    /*
    public int maxProfit(int[] prices) {
        if (prices.length == 0 || prices.length == 1) {
            return 0;
        }
        int maxProfit = 0;
        for (int right = 1; right < prices.length; right++) {
            for (int left = 0; left < right; left++) {
                if (prices[left] >= prices[right]) {
                    maxProfit = 0;
                }
                else {
                    maxProfit = Math.max(maxProfit, prices[right] - prices[left]);
                }
            }
        }
        return maxProfit;
    }
    */

    // 思路：找到最小值并记录 然后和其之后的值进行比较 得到maxProfit
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (maxProfit < (prices[i] - min)) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }
}
