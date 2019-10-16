package learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 找出给定数组中的众数(出现次数大于 n/2 向下取整)
 */
@SuppressWarnings("all")
public class MajorityElement {

    // 思路1：利用hashMap 全部遍历一遍 效率较低
    /*
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int num = Integer.MIN_VALUE;
        int major = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            if (map.containsKey(i)) {
                int count = map.get(i);
                count++;
                map.put(i, count);
            }
            else {
                map.put(i, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > num) {
                num = entry.getValue();
                major = entry.getKey();
            }

        }
        return major;
    }
     */

    // 思路2：排序 题目要求众数出现次数大于 n/2 向下取整
    // 时间复杂度和空间复杂度取决于排序
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    // 思路3：摩尔投票法
}
