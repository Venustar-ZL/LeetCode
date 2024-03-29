package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 找出所有满足条件且不重复的三元组。
 *
 * 解题思路：
 * 首先对数组进行排序，排序后固定一个数 nums[i]nums[i]，再使用左右指针指向 nums[i]nums[i]后面的两端，数字分别为 nums[L]nums[L] 和 nums[R]nums[R]，计算三个数的和 sumsum 判断是否满足为 00，满足则添加进结果集
 * 如果 nums[i]nums[i]大于 00，则三数之和必然无法等于 00，结束循环
 * 如果 nums[i]nums[i] == nums[i-1]nums[i−1]，则说明该数字重复，会导致结果重复，所以应该跳过
 * 当 sumsum == 00 时，nums[L]nums[L] == nums[L+1]nums[L+1] 则会导致结果重复，应该跳过，L++L++
 * 当 sumsum == 00 时，nums[R]nums[R] == nums[R-1]nums[R−1] 则会导致结果重复，应该跳过，R--R−−
 */
public class SumToNumsThree {

    /**
     *
     * @param nums
     * @return 返回符合条件的数组
     */
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        if ( nums == null && nums.length == 0) {
            return result;
        }
        int len = nums.length;

        // 排序
        Arrays.sort(nums);

        for (int i = 0; i < len; i++) {
            // nums[i] > 0 表明后面的数字全部大于零
            // nums[len -1] < 0 表明前面的数字全部小于零
            if (nums[i] > 0 || nums[len - 1] < 0) {
                break;
            }

            // 去重 Java数组下标为-1是否指向前一个
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int L = i + 1;
            int R = len - 1;

            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    // 去重
                    while (L < R && nums[L] == nums[L + 1]) {
                        L++;
                    }
                    while (L < R && nums[R] == nums[R - 1]) {
                        R--;
                    }
                    L++;
                    R--;
                } else if (sum < 0) {
                    L++;
                }else if (sum > 0) {
                    R--;
                }
            }
        }

        return result;

    }

}
