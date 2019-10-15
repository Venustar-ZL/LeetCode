package learn;

/**
 * 给定一个已按照升序排列 的有序数组
 * 找到两个数使得它们相加之和等于目标数
 * 返回这两个数的下标
 */
public class TwoSum {

    // 思路1：利用左右指针
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length == 0 || numbers.length == 1) {
            return null;
        }
        int[] res = new int[2];
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int count = numbers[left] + numbers[right];
            if (count == target) {
                break;
            }
            else if (count > target) {
                right--;
            }
            else if (count < target) {
                left++;
            }
        }
        res[0] = left + 1;
        res[1] = right + 1;
        return res;
    }

}
