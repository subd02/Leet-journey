class Solution {
    private int pidx = 0;
    private Map<Integer, Integer> inMap = new HashMap<>();

    public TreeNode helper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        int rootVal = preorder[pidx++];
        TreeNode root = new TreeNode(rootVal);
        int inidx = inMap.get(rootVal);

        root.left = helper(preorder, left, inidx - 1);
        root.right = helper(preorder, inidx + 1, right);

        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        pidx = 0; 
        inMap.clear();
        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }
        return helper(preorder, 0, inorder.length - 1);
    }
}