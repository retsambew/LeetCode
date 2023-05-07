/*
 * 2373. Largest Local Values in a Matrix
 */

public class LargestLocal {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] ans = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                int max = grid[i][j];
                for (int p = 0; p < 3; p++) {
                    for (int q = 0; q < 3; q++) {
                        if (grid[i + p][j + q] > max)
                            max = grid[i + p][j + q];
                    }
                }
                ans[i][j] = max;
            }
        }
        return ans;
    }
}
