/*
 * 104. Maximum Depth of Binary Tree
 */

public class HeightOfTree {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return (Math.max(maxDepth(root.left), maxDepth(root.right)) + 1);
    }
}
