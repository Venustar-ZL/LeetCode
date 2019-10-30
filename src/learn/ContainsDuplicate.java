package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: ContainsDuplicate
 * @Description: 判断一个数组中是否存在重复元素
 * @Date: 2019-10-30 10:33
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ContainsDuplicate {

    // 哈希表求解
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                return true;
            }
            else {
                map.put(num, num);
            }
        }
        return false;

    }

}
