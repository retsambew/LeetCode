/*
 * 199. Binary Tree Right Side View
 */

public class RightView {
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<Integer> ans = new LinkedList<Integer>();
        if (root == null)
            return ans;
        q.add(root);
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode cur = q.poll();
                if (i == n - 1)
                    ans.add(cur.val);
                if (cur.left != null)
                    q.add(cur.left);
                if (cur.right != null)
                    q.add(cur.right);
            }
        }
        return ans;
    }
}
