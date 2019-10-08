package learn;

/**
 * 搜索插入位置
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
//        1、此方法太生硬，不可取
//        if (nums.length == 0) {
//            return 0;
//        }
//
//        if (target > nums[nums.length - 1]) {
//            return nums.length - 1;
//        }
//        if (target < nums[0]) {
//            return 0;
//        }
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] == target) {
//                return i;
//            }
//            if (target > nums[i - 1] && target < nums[i]) {
//                return i;
//            }
//        }
//        return 0;
//
//    }

        //2、二分查找法
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }

}
