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
    public void helper(TreeNode root, List<Integer> list, int level){
        if(root==null){
            return;
        }
        if(level==list.size()){
            list.add(root.val);
        }else if(level<list.size()){
            list.set(level, list.get(level)+root.val);
        }
        helper(root.left, list, level+1);
        helper(root.right, list, level+1);

    }
    public int maxLevelSum(TreeNode root) {
        ArrayList<Integer> list= new ArrayList<>();
        helper(root,list,0);
        int maxSum=Integer.MIN_VALUE;
        int level=0;
        
        for(int i=0; i<list.size(); i++){
            if(list.get(i)>maxSum){
                maxSum=list.get(i);
                level=i;
            }
        }
        return level+1;
    }
}