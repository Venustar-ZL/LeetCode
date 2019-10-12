package learn;

import java.util.LinkedList;

/**
 * 判断给定的二叉树是否是高度平衡的二叉树
 */
public class IsBalanced {

    // 深度遍历每个节点
    // 递归求出每个节点的左右子树高度之差
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return false;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.poll();
            int left = getDepth(node.left);
            int right = getDepth(node.right);
            if (Math.abs(left - right) > 1) {
                return false;
            }
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return true;
    }

    public int getDepth (TreeNode node) {
        if (node == null) {
            return 0;
        }
        else {
            int left = getDepth(node.left);
            int right = getDepth(node.right);
            return Math.max(left, right) + 1;
        }
    }
}
