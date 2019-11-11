package learn;

import java.util.LinkedList;

/**
 * @ClassName: MoveZeroes
 * @Description: 将数组中所有的零移动至末尾
 * @Date: 2019-11-06 16:17
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class MoveZeroes {

    // 必须在原数组上操作
    /*
    public void moveZeroes(int[] nums) {
        LinkedList<Integer> list = new LinkedList<>();
        int len = nums.length;
        // index 记录末尾不为零的下标
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                list.addLast(nums[i]);
            }
            else {
                list.add(index, nums[i]);
                index = i + 1;
            }
        }
    }

     */

    // 双指针法
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int i = 0;
        for (int j = 0; j < len; j++) {
            if (nums[j] != 0) {
                if (i != j) {
                    nums[i] = nums[j];
                }
                i++;
            }
        }
        for (; i < len; i++) {
            nums[i] = 0;
        }

    }

}
