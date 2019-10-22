package learn;

import com.sun.xml.internal.ws.message.stream.StreamAttachment;

import java.util.Arrays;

/**
 * 给定一个数组
 * 将数组中的元素向右移动 k 个位置
 */
@SuppressWarnings("all")
public class Rotate {

    // 思路1：通过一个临时变量 循环移动
    // 此解法时间复杂度为 O(n^2) 不可取
    /*
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        while (k > 0) {
            int temp = nums[len - 1];
            for (int i = len - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }

     */

    // 思路2：每次移动的是一个小的数组 以空间换取时间

    // 思路3：先将数组反转 在将0~(k-1)部分的数组反转 最后将k~(nums.length-1)部分的数组反转
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);

    }
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
