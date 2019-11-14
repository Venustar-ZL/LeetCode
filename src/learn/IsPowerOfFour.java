package learn;

/**
 * @ClassName: IsPowerOfFour
 * @Description: 给定一个整数判断是否是4的幂次方
 * @Date: 2019-11-11 17:09
 * @Author: ZhangLei
 * version: 1.0
 **/
public class IsPowerOfFour {

    public boolean isPowerOfFour(int num) {
        if (num < 1) {
            return false;
        }
        while (num % 4 == 0) {
            num /= 4;
        }
        return num == 1;
    }

}
