/*
 * 102. Binary Tree Level Order Traversal
 */

public class LevelOrderTraversal {
    public static void main(String[] args) {
        public List<List<Integer>> levelOrder(TreeNode root) {
            Queue<TreeNode> q=new LinkedList<TreeNode>();
            List<List<Integer>> list = new ArrayList<List<Integer>>();
            if(root==null) return list;
            q.add(root);
            q.add(null);
            int i=0;
            list.add(new ArrayList<Integer>());
            while(q.size()>1){
                TreeNode node=q.poll();
                if(node==null){
                    i++;
                    list.add(new ArrayList<Integer>());
                    q.add(null);
                    continue;
                }
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                list.get(i).add(node.val);
            }
            return list;
        }    
    }
}
