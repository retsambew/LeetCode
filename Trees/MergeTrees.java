/*
 * 617. Merge Two Binary Trees
 */

public class MergeTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        TreeNode t = new TreeNode(root1.val + root2.val);
        t.left = mergeTrees(root1.left, root2.left);
        t.right = mergeTrees(root1.right, root2.right);
        return t;
    }
}
