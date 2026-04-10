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
        List<Integer> integers = new ArrayList<>();

        if(root == null) return integers;


        List<Integer> nextLeft = inorderTraversal(root.left);
        for(int a : nextLeft){
            integers.add(a);
        }
        integers.add(root.val);
        List<Integer> nextRight = inorderTraversal(root.right);
        for(int a : nextRight){
            integers.add(a);
        }

        return integers;
    }
}