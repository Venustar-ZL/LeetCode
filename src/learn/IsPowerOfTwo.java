package learn;

/**
 * @ClassName: IsPowerOfTwo
 * @Description: 判断是否是2的幂数
 * @Date: 2019-10-30 14:25
 * @Author: ZhangLei
 * version: 1.0
 **/
public class IsPowerOfTwo {

    // 位运算
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

}
