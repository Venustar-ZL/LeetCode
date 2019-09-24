package learn;

/**
 * 给出一个 32 位的有符号整数，将这个整数中每位上的数字进行反转。
 * 不建议使用String转int 太捞了
 */
public class Reverse {

    public int reverse(int x) {

        int result = 0;
        while (x != 0) {
            int pop =  x % 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            result = result * 10 + pop;
            x /= 10;
        }
        return result;

    }

}
