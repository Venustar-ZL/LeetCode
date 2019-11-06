package learn;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: MissingNumber
 * @Description: 找到0..n中缺失的那个数字
 * @Date: 2019-11-06 16:03
 * @Author: ZhangLei
 * version: 1.0
 **/
public class MissingNumber {

    public int missingNumber(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            set.add(nums[i]);
        }
        for (int i = 0; i < len + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 0;
    }

}
