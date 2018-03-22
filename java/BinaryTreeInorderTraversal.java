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
        if (root == null)
            return arr;
        recursive(root, arr);
        return arr;
    }

    public void recursive(TreeNode root, List<Integer> arr){
        if (root != null){
            recursive(root.left, arr);
            arr.add(root.val);
            recursive(root.right, arr);
        }

    }
}