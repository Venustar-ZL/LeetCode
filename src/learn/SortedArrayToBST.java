package learn;

/**
 * 将一个升序数组转换成一个高度平衡二叉搜索树
 */
public class SortedArrayToBST {

    // 利用平衡二叉搜索树（中序遍历）和升序数组的特性
    // 二分法求解 注意边界问题
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        return sortArrayToBSTCore(nums, 0 ,nums.length - 1);
    }

    public TreeNode sortArrayToBSTCore(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortArrayToBSTCore(nums, start, mid - 1);
        root.left = sortArrayToBSTCore(nums, mid, end);
        return root;
    }

}
