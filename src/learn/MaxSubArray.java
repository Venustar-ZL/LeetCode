package learn;

/**
 * 给定一个整数数组 nums
 * 找到一个具有最大和的连续子数组（子数组最少包含一个元素）
 * 返回其最大和
 */
public class MaxSubArray {

    /**
     * 思路：
     * ans始终保证了最大和，当sum变小，ans保持不变
     * （膜拜此题解法的大佬）
     */

    public int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            }
            else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }

}

