public class BSTBooleanRecursion {
    TreeNode prev;
    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) return true;
        if (inorder(root.left) == false) return false;
        if (prev != null && prev.val >= root.val) {
            return false;
        }
        prev = root;
        return inorder(root.right);
    }
}
