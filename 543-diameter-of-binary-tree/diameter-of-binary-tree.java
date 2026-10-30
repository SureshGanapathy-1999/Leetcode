/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        height(root);
        return diameter;
    }

    public int height(TreeNode A){

        if(A == null){
            return -1;
        }

        int lh = height(A.left);
        int rh = height(A.right);

        diameter = Math.max(diameter , lh + rh + 2);

        return 1 + Math.max(lh , rh);

    }
}