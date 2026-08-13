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
    public void helper(TreeNode root, List<List<Integer>> ans){
        if(root==null){
            return;
        }
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        List<Integer> list= new ArrayList<>();
        while(!q.isEmpty()){
            TreeNode curr= q.remove();
            if(curr!=null){
                list.add(curr.val);
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }else{
                ans.add(list);
                if(q.isEmpty()){
                    break;
                }else{
                    list= new ArrayList<>();
                    q.add(null);
                }
            }
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans= new ArrayList<>();
        helper(root, ans);
        return ans;
    }
}