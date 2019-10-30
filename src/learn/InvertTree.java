package learn;

import java.util.LinkedList;

/**
 * @ClassName: InvertTree
 * @Description: 翻转一颗二叉树
 * @Date: 2019-10-30 11:25
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class InvertTree {

    /*
        构建二叉树
        for (int i = 0; i < invertTree.size() / 2 - 1; i++) {
            invertTree.get(i).left = invertTree.get(i * 2 + 1);
            invertTree.get(i).right = invertTree.get(i * 2 + 2);
        }
        int lastParentIndex = invertTree.size() / 2 - 1;
        invertTree.get(lastParentIndex).left = invertTree.get(lastParentIndex * 2 + 1);
        if (invertTree.size() % 2 == 1) {
            invertTree.get(lastParentIndex).right = invertTree.get(lastParentIndex * 2 + 2);
        }
        */


    // 迭代 层次遍历交换每个节点的左右子节点
    /*
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        LinkedList<TreeNode> tree = new LinkedList<>();
        tree.add(root);
        while (!tree.isEmpty()) {
            TreeNode node = tree.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            while (node.left != null) {
                tree.add(node.left);
            }
            while (node.right != null) {
                tree.add(node.right);
            }
        }
        return root;
    }

     */

    // 递归
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

}
