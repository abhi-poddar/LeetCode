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
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null){
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        return list;
        // if(root==null)return list;
        // list.add(root.val);
        // preorderTraversal(root.left);
        // preorderTraversal(root.right);
        // return list;
    }
}