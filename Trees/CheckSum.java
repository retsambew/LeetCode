/*
 * 2236. Root Equals Sum of Children
 */

public class CheckSum {
    public boolean checkTree(TreeNode root) {
        return (root.left.val + root.right.val) == root.val;
    }
}
