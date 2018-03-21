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
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        TreeNode root = createTree(nums, 0, nums.length-1);
        return root;
    }

    public TreeNode createTree(int[] nums, int low, int high){
        if(low > high)  return null;

        int mid = (low + high + 1)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = createTree(nums, low, mid-1);
        root.right = createTree(nums, mid+1, high);

        return root;
    }
}