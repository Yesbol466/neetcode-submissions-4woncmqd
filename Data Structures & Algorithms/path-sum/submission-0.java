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

    List<Integer> integers = new ArrayList<>();

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;

        integers.add(root.val);

        if(hasPathSum(root.left, targetSum)){
            return true;
        }

        if(hasPathSum(root.right, targetSum)){
            return true;
        }

        for(int i : integers){
            targetSum -= i;
        }

        if(targetSum == 0 && isLeafNode(root)){
            return true;
        } else integers.remove(integers.size() - 1);

        return false;
    }

    public boolean isLeafNode(TreeNode node){
        return node.left == null && node.right == null;
    }
}