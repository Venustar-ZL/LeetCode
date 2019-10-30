package learn;

import java.util.Arrays;

/**
 * @ClassName: CountPrimes
 * @Description: 统计所有小于非负整数 n 的质数的数量
 * @Date: 2019-10-29 15:06
 * @Author: ZhangLei
 * version: 1.0
 **/
public class CountPrimes {

    public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
