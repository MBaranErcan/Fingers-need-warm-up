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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = 0;
        return rootToLeafPathSum(root, targetSum, sum);
    }

    public boolean rootToLeafPathSum(TreeNode root, int target, int sum) {
        if (root == null) return false;
        if (root.left == null && root.right == null) {
            sum += root.val;
            if (sum == target) return true;
        }
        return rootToLeafPathSum(root.left, target, (sum+root.val)) || rootToLeafPathSum(root.right, target, (sum+root.val));
    }
}