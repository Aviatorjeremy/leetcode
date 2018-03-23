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
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length == 0){
            return null;
        }

        for(int i=0; i<inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(preorder, 0, preorder.length-1, inorder, 0 ,inorder.length-1);
    }

    public TreeNode build(int[] preorder, int s1, int e1, int[] inorder, int s2, int e2){
        if (s1 > e1 || s2 > e2) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[s1]);
        int mid = map.get(preorder[s1]);
        int dis = mid - s2;

        root.left = build(preorder, s1+1, s1+dis, inorder, s2, mid-1);
        root.right = build(preorder, s1+dis+1, e1, inorder, mid+1, e2);
        return root;
    }
}