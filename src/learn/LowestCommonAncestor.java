package learn;

/**
 * @ClassName: LowestCommonAncestor
 * @Description: 找到一个给定二叉搜索树中指定两个节点的最近公共祖先
 * @Date: 2019-10-31 10:18
 * @Author: ZhangLei
 * version: 1.0
 **/
public class LowestCommonAncestor {

    // 二叉搜索树的左节点小于根节点 右节点大于根节点
    // 利用二叉树特性
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        int pVal = p.val;
        int qVal = q.val;
        TreeNode node = root;
        while (node != null) {
            int parentVal = node.val;
            if (pVal > parentVal && qVal > parentVal) {
                node = node.right;
            } else if (pVal < parentVal && qVal < parentVal) {
                node = node.left;
            } else {
                return node;
            }
        }
        return null;
    }
}
