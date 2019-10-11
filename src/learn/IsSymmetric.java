package learn;

import java.util.LinkedList;

/**
 * 判断二叉树是否镜像对称
 */

public class IsSymmetric {

    //递归解决
    //思路：A的左子树与B的右子树相同   A的右子树与B的左子树相同
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror (TreeNode A, TreeNode B) {
        //递归结束条件
        if (A == null && B == null) {
            return true;
        }
        //递归结束条件
        if (A == null || B == null) {
            return false;
        }

        return (A.val == B.val) && isMirror(A.left, B.right) && isMirror(A.right, B.left);
    }
}
