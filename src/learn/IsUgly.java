package learn;

/**
 * @ClassName: IsUgly
 * @Description: 判断一个给定的数是否为丑数
 * @Date: 2019-11-06 15:45
 * @Author: ZhangLei
 * version: 1.0
 **/
public class IsUgly {

    /**
     * 丑数就是质因数只包含 2 3 5 的树
     * @param num
     * @return
     */
    public boolean isUgly(int num) {
        if (num < 1) {
            return false;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        return num == 0;
    }

}
