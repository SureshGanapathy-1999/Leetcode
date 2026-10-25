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
    public List<Integer> inorderTraversal(TreeNode root) {
        return inorder(root);
    }

    public List<Integer> inorder(TreeNode root){
        ArrayList<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        ans.addAll(inorder(root.left));
        ans.add(root.val);
        ans.addAll(inorder(root.right));

        return ans; 
    }
}