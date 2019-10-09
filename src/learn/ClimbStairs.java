package learn;

/**
 * 爬楼梯
 */
public class ClimbStairs {

    /**
     * 利用动态规划求解
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        int[] cs = new int[n + 1];
        cs[0] = 1;
        cs[1] = 1;
        for (int i = 2; i <= n; i++) {
            cs[i] = cs[i -1] + cs[i - 2];
        }
        return cs[n];
    }

}
