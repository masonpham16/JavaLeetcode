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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case:
        // check if both nodes are null
        if (p == null && q == null) {
            return true;
        }
        // proceed to next if statement

        // If one if them is null or their values don't match
        // then trees don't match
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // proceed to next if statement

        // Recursively check left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
