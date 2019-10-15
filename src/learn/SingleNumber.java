package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 找出只出现一次的数
 */
@SuppressWarnings("all")
public class SingleNumber {

    // 思路1：利用哈希表求解
    /*
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = count == null ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

     */

    // 思路2：利用异或进行位运算
    /*
       了解异或的运算规则：
            数学运算：a^0=a  a^a=0 a^b^a=a^a^b=b
    */
    public int singleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans =  ans ^ nums[i];
            }
        }
        return ans;
    }
}
