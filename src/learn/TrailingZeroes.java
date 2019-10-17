package learn;

/**
 * 返回给定整数阶乘之后尾数零的数量
 */
@SuppressWarnings("all")
public class TrailingZeroes {

    // 思路1：阶乘之后求余？ 时间复杂度太高 阶乘之后返回的数过大 无法处理
    // 此法不可取
    /*
    public int trailingZeroes(int n) {
        long fac = factor(n);
        int res = 0;
        while (fac % 10 == 0) {
            res++;
            fac = fac / 10;
        }
        return res;
    }

    public long factor (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factor(n - 1);
    }
     */

    // 思路2：每逢5的倍数 尾数零的个数加1
    // 简单计算 n / 5 不行   忽略了25 = 5 * 5 存在多个5为一个数的情况
    public int trailingZeroes (int n) {
        int res = 0;
        n = n / 5;
        while (n != 0) {
            res += n;
            n /= 5;
        }
        return res;
    }

}
