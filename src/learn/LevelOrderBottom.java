package learn;

import java.util.LinkedList;
import java.util.List;

/**
 * 给出一个二叉树的自底向上的层次遍历
 */
public class LevelOrderBottom {

    // 思路：用LinkedList双向链表，每次直接添加在头部
    // 如何判断节点是否是同一层
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> res = new LinkedList<>();

        if (root == null) {
            res = null;
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.addFirst(level);
        }

        return res;
    }

}
