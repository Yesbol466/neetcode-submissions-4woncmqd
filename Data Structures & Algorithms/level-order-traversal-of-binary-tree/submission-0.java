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

    Queue<TreeNode> queue = new ArrayDeque<>();
    List<List<Integer>> lists = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root != null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            int length = queue.size();
            List<Integer> sublist = new ArrayList<>();

            for(int i = 0; i<length; i++){
                TreeNode current = queue.poll(); //pop

                if(current.left != null){
                  queue.add(current.left);
                }

                if(current.right != null){
                  queue.add(current.right);
                }

                sublist.add(current.val);
            }

            lists.add(sublist);

        }

        return lists;
    }
}
