package learn;

/**
 * @ClassName:
 * @Description: 判断一个数是不是“快乐数”
 * @Date: 2019-10-28 10:26
 * @Author: ZhangLei
 * version: 1.0
 **/

import java.util.HashSet;
import java.util.Set;

/**
 * 一个“快乐数”定义为：
 * 对于一个正整数
 * 每一次将该数替换为它每个位置上的数字的平方和
 * 然后重复这个过程直到这个数变为 1
 * 也可能是无限循环但始终变不到 1
 * 如果可以变为 1
 * 那么这个数就是快乐数。
 */
public class IsHappy {

    public boolean isHappy(int n) {
        if (n == 0) {
            return false;
        }
        // 使用set存储结果，避免死循环问题
        Set<Integer> set = new HashSet();
        int ans = 0;
        while (true) {
            while (n != 0) {
                ans += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (ans == 1) {
                return true;
            }
            if (set.contains(ans)) {
                return false;
            }
            else {
                set.add(ans);
                n = ans;
                ans = 0;
            }
        }
    }

}
