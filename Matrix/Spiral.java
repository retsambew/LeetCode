/**
 * 54. Spiral Matrix
 */
public class Spiral {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l1 = new ArrayList<Integer>();
        int l = 0, b = matrix.length - 1, r = matrix[0].length - 1, t = 0;
        while (l <= r || t <= b) {
            if (t <= b) {
                for (int i = l; i <= r; i++)
                    l1.add(matrix[t][i]);
                t++;
            }
            if (l <= r) {
                for (int i = t; i <= b; i++)
                    l1.add(matrix[i][r]);
                r--;
            }
            if (t <= b) {
                for (int i = r; i >= l; i--)
                    l1.add(matrix[b][i]);
                b--;
            }
            if (l <= r) {
                for (int i = b; i >= t; i--)
                    l1.add(matrix[i][l]);
                l++;
            }
        }
        return l1;
    }
}