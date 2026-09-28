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
    public TreeNode IS(TreeNode root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    public TreeNode delete(TreeNode root, int key){
        if(root==null){return root;}
        if(root.val<key){
            root.right= delete(root.right, key);
        }else if(root.val>key){
            root.left= delete(root.left, key);
        }else{
            //nochild
            if(root.left==null && root.right==null){
                return null;
            }
            //1child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }

            //2child
            TreeNode inorder= IS(root.right);
            root.val=inorder.val;
            root.right=delete(root.right,inorder.val);
        }
        return root;

    }
    public TreeNode deleteNode(TreeNode root, int key) {
        return delete(root,key);

    }
}