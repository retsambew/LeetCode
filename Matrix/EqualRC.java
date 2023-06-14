/*
 * 2352. Equal Row and Column Pairs
 */

public class EqualRC {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> m = new HashMap<String, Integer>();
        int n = grid.length;
        for (int i = 0; i < n; i++)
            m.put(Arrays.toString(grid[i]), m.getOrDefault(Arrays.toString(grid[i]), 0) + 1);
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int temp[] = new int[n];
            for (int j = 0; j < n; j++)
                temp[j] = grid[j][i];
            ans += m.getOrDefault(Arrays.toString(temp), 0);
        }
        return ans;
    }
}
