package learn;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。
 */
public class ThreeSumClosest {


    public int threeSumClosest(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int L = i + 1;
            int R = length - 1;
            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (Math.abs(sum - target) < Math.abs(result- target)) {
                    result = sum;
                }
                if (sum > target) {
                    R--;
                }
                else if (sum < target) {
                    L++;
                }
                else {
                    return result;
                }
            }

        }
        return result;

    }



}
