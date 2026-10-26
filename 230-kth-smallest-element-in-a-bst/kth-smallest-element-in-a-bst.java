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

    int a = 0;

    public int kthSmallest(TreeNode root, int k) {
        a = k;
        return find(root);
    }

    public int find(TreeNode root){

        if(root == null){
            return -1;
        }

        int a1 = find(root.left);
        if(a == 0){
            return a1;
        }
        a--;
        if(a == 0){
            return root.val;
        }

        return find(root.right);
    }
}