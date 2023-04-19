/*
 * 1379. Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 */

public class FindNodeInCloned {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == target)
            return cloned;
        if (original.left != null) {
            TreeNode t = getTargetCopy(original.left, cloned.left, target);
            if (t != null)
                return t;
        }
        if (original.right != null)
            return getTargetCopy(original.right, cloned.right, target);
        return null;
    }
}