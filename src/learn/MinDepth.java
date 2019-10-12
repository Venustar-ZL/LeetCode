package learn;

import java.util.LinkedList;

/**
 * 给出一个二叉树的最小深度
 */
@SuppressWarnings("all")
public class MinDepth {

    // 思路1：递归求解左右子树深度   root节点的左右子树为特殊情况，需格外判断
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            int left = minDepth(root.left);
            int right = minDepth(root.right);
            left = left == 0 ? right : left;
            right = right == 0 ? left : right;
            return Math.min(left, right) + 1;
        }
    }

    // 思路2：（非递归后序遍历后序）设置min 每进入下一层加1 返回上一层减1 min始终记录最小深
    // 思路3： 广度遍历 求最小层数
}
