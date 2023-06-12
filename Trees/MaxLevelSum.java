/**
 * 1161. Maximum Level Sum of a Binary Tree
 */
public class MaxLevelSum {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max = Integer.MIN_VALUE, sum = 0;
        int index = 1, ans = 1;
        while (!q.isEmpty()) {
            for (int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                sum += node.val;
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }
            if (max < sum) {
                max = sum;
                ans = index;
            }
            index++;
            sum = 0;
        }
        return ans;
    }
}