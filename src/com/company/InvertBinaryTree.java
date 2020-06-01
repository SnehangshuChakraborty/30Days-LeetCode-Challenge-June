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
    public TreeNode invertTree(TreeNode root) {

        //If root is null; do nothing
        if(root == null){
            return root;
        }

        //get the left and right child of last root node
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        //swap both
        root.right = left;
        root.left = right;

        //return the last number
        return root;
    }
}