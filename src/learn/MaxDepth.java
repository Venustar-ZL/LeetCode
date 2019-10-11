package learn;

import java.util.LinkedList;

/**
 * 给出一个二叉树的最大深度
 */
public class MaxDepth {
    // 递归求左右子树的最大深度
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }

}
