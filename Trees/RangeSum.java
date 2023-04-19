/*
 * 938. Range Sum of BST
 */

public class RangeSum {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null)
            return 0;
        int leftSum, rightSum;
        leftSum = rangeSumBST(root.left, low, high);
        rightSum = rangeSumBST(root.right, low, high);
        if (root.val >= low && root.val <= high)
            return leftSum + rightSum + root.val;
        return leftSum + rightSum;
    }
}
