/**
 * 1557. Minimum Number of Vertices to Reach All Nodes
 * InDegree approach
 */

public class MinVerticeToAll {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int[] inDegrees = new int[n];
        for (List<Integer> edge : edges) {
            inDegrees[edge.get(1)]++;
        }
        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (inDegrees[i] == 0)
                ans.add(i);
        }
        return ans;
    }
}