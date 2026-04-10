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

    public int kthSmallest(TreeNode root, int k) {
    
        height(root);
        return integers.get(k-1);
    }

    public void height(TreeNode root){
        if(root == null) return;
        height(root.left);
        integers.add(root.val);
        height(root.right);
    }
}
