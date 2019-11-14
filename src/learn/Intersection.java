package learn;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: Intersection
 * @Description: 给出两个数组的交集
 * @Date: 2019-11-14 14:04
 * @Author: ZhangLei
 * version: 1.0
 **/
public class Intersection {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }
        int len1 = nums1.length;
        int len2 = nums2.length;
        Set<Integer> temp = new HashSet<>();
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i< len1; i++) {
            nums.add(nums1[i]);
        }
        for (int i = 0; i < len2; i++) {
            if (nums.contains(nums2[i])) {
                temp.add(nums2[i]);
            }
        }
        int i = 0;
        int[] res = new int[temp.size()];
        for (Integer num : temp) {
            res[i++] = num;
        }
        return res;
    }

}
