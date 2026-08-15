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
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht, int diam){
            this.ht= ht;
            this.diam= diam;
        }
    }
    public static TreeInfo diam2(TreeNode root){
        if(root==null){
            return new TreeInfo(0, 0);
        }
        TreeInfo left= diam2(root.left);
        TreeInfo right= diam2(root.right);

        int ht= Math.max(left.ht, right.ht)+1;
        int diam1= left.diam;
        int diam2= right.diam;
        int diam3= left.ht+right.ht+1;

        int di= Math.max(Math.max(diam1,diam2), diam3);
        TreeInfo myInfo= new TreeInfo(ht, di);
        return myInfo;

    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diam2(root).diam-1;
    }
}