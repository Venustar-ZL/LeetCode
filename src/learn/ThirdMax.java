package learn;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @ClassName: ThirdMax
 * @Description: 返回给定数组中第三大的数
 * @Date: 2019-11-18 15:28
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ThirdMax {

    // 考虑到存在重复出现的数的情况，不能简单的直接取出
    public int thirdMax(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        // 进行去重操作
        Set<Integer> set = new LinkedHashSet<>();
        for (int i = len - 1; i >= 0; i--) {
            set.add(nums[i]);
        }
        if (set.size() < 3) {
            return (int)set.toArray()[set.size() - 1];
        }
        return (int)set.toArray()[2];
    }

}
