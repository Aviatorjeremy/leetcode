/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        if (root == null)
            return arr;
        while(root != null || stack.size() > 0){
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            if(stack.size() > 0){
                root = stack.pop();
                arr.add(root.val);
                root = root.right;
            }
        }
        return arr;
    }
}