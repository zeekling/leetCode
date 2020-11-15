package com.leetcode.simple;

/**
 * @apiNote 给定一个二叉树,确定它是高度平衡的。对于这个问题,一棵高度平衡的二叉树的定义是：一棵二叉树中每个节点的两个子树的深度相差不会超过1。
 * @author zeekling
 * @version 1.0
 * @since 2019-12-28
 */
public class BalancedTree {
	/**
     * @param root: The root of binary tree.
     * @return: True if this Binary tree is Balanced, or false.
     */
    public boolean isBalanced(TreeNode root) {
        // write your code here
        if (root == null){
            return true;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);

        if (Math.abs(leftDepth - rightDepth) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int depth(TreeNode root){
        if (root == null){
            return 0;
        }
        int leftDepth = depth(root.left) + 1;
        int rightDepth = depth(root.right) + 1;

        return Math.max(leftDepth, rightDepth);
    }
}

class TreeNode {
      public int val;
      public TreeNode left, right;
      public TreeNode(int val) {
          this.val = val;
          this.left = this.right = null;
      }
}
