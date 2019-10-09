package learn;

/**
 * 返回给定数的平方根
 */
public class MySqrt {

    /**
     * 1、使用二分查找法通用模板求解此题
     * 2、牛顿法求解仅作参考
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        long left = 0;
        long right = x;
        while (left < right) {
            long mid = (left + right + 1) / 2;
            long square = mid * mid;
            if (square > x) {
                right = mid - 1;
            }
            else {
                left = mid;
            }
        }
        return (int) left;
    }
}
