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
    int n = Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        int d = 1;

        depth(root, d);
        return n;
    }

    public void depth(TreeNode root, int d){
        if(root.left == null && root.right == null){
            n = n < d ? n : d;
            return;
        }

        if(root.left != null){
            d++;
            depth(root.left, d);
            d--;
        }

        if(root.right != null){
            d++;
            depth(root.right, d);
            d--;
        }


    }
}