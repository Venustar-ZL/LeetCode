package learn;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: ContainsNearbyDuplicate
 * @Description: 判断数组中重复元素的最大下标之差是否小于等于k
 * @Date: 2019-10-30 10:39
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class ContainsNearbyDuplicate {

    /*
    // 解法粗糙
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i])) {
                int index = map.get(nums[i]);
                map.put(nums[i], i);
                set.add(Math.abs(index - i));
            }
            else {
                map.put(nums[i], i);
            }
        }
        for (int i = 0; i <= k; i++) {
            if (set.contains(i)) {
                return true;
            }
        }
        return false;
    }

     */

    // 参考网上题解
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }

}
