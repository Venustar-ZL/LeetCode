package learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: BinaryTreePaths
 * @Description: 返回一个二叉树中所有根节点到叶子节点的路径
 * @Date: 2019-10-31 15:10
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class BinaryTreePaths {

    /*
    // 递归求解
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        getPath(root, "", paths);
        return paths;
    }

    public  void getPath(TreeNode root, String path, List<String> paths) {
        if (root != null) {
            path += root.val;
            if (root.left == null && root.right == null) {
                paths.add(path);
            }
            else {
                path += "->";
                getPath(root.left, path, paths);
                getPath(root.right, path, paths);
            }
        }
    }

     */

    // 迭代求解
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root ==  null) {
            return paths;
        }
        LinkedList<TreeNode> node_stack = new LinkedList<>();
        LinkedList<String> path_stack = new LinkedList<>();
        node_stack.offer(root);
        path_stack.offer(Integer.toString(root.val));
        while (!node_stack.isEmpty()) {
            TreeNode node = node_stack.poll();
            String path = path_stack.poll();
            if (node.left == null && node.right == null) {
                paths.add(path);
            }
            if (node.left != null) {
                node_stack.offer(node.left);
                path_stack.offer(path + "->" + Integer.toString(node.left.val));
            }
            if (node.right != null) {
                node_stack.offer(node.right);
                path_stack.offer(path + "->" + Integer.toString(node.right.val));
            }
        }
        return paths;

    }

}
