package learn;

/**
 * @ClassName: IsPowerOfThree
 * @Description: 给定一个整数判断是否是3的幂次方
 * @Date: 2019-11-11 16:43
 * @Author: ZhangLei
 * version: 1.0
 **/
public class IsPowerOfThree {

    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return true;
        }
        while (n % 3 == 0) {
             n /= 3;
        }
        return n == 1;
    }
}
