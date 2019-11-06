package learn;

/**
 * @ClassName: AddDigits
 * @Description: 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * @Date: 2019-11-06 15:06
 * @Author: ZhangLei
 * version: 1.0
 **/
public class AddDigits {

    public int addDigits(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return addDigits(sum);
    }

}
