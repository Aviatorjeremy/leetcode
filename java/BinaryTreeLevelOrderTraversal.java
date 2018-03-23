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
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>>  ret = new ArrayList<List<Integer>>();
        tree2list(ret, root, 0);
        return ret;
    }

    public void tree2list(List<List<Integer>> list, TreeNode root, int height){
        if(root == null){
            return;
        }
        while(list.size() == height){
            list.add(new LinkedList());
        }

        list.get(height).add(root.val);
        tree2list(list, root.left, height+1);
        tree2list(list, root.right, height+1);

    }

}