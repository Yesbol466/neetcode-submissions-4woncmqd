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
    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null){
            return null;
        }

        if(root.val > key){
            root.left = deleteNode(root.left,key);
        } else if(root.val < key){
            root.right = deleteNode(root.right,key);
        } else {
            if(root.left == null){
                return root.right;
            } 
            else if(root.right == null){
                return root.left;
            } else {
                TreeNode minNode = minNode(root.right);
                int minNodeVal = minNode.val;
                root.val = minNodeVal;
                root.right = deleteNode(root.right, minNodeVal);
            }
        }

        return root;
    }

    public TreeNode minNode(TreeNode root){
        TreeNode current = root;

        while(current != null && current.left != null){
            current = current.left;
        }

        return current;
    }
}