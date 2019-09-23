package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
public class SumToNums {

    /**
     * @param nums 传入的参数
     * @param target 目标值
     */
    public int[] Solution (int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = null;
        for (int i = 0; i < nums.length; i++)
        {
            int temp = target - nums[i];
            if(map.containsKey(temp)) {
                result = new int[] {map.get(temp), i};
            }
            map.put(nums[i], i);
        }
        return result;

    }

}