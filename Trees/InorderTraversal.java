/*
 * 94. Binary Tree Inorder Traversal
 */

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l = new ArrayList<Integer>();
        if (root == null)
            return l;
        l.addAll(inorderTraversal(root.left));
        l.add(root.val);
        l.addAll(inorderTraversal(root.right));
        return l;
    }
}
