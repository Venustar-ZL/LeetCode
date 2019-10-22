package learn;

/**
 * 求给定无符号正数中二进制表达式中 ‘1’的个数
 */
public class HammingWeight {

    // you need to treat n as an unsigned value
    // 思路：关键在于如何将有符号整数转换成无符号整数
    public int hammingWeight(int n) {
        int count = n < 0 ? 1 : 0;
        n &= 0x7fffffff;
        while (n > 0) {
            int temp = n % 2;
            if (temp == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

}
