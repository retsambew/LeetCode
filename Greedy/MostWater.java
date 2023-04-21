/*
 * 11. Container With Most Water
 * Array / Two Pointer / Greedy
 */

public class MostWater {
    // Two Pointer
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0, j = height.length - 1, ar = 0;
        while (i < j) {
            if (height[i] > height[j]) {
                ar = height[j] * (j - i);
                j--;
            } else {
                ar = height[i] * (j - i);
                i++;
            }
            if (ar > maxArea)
                maxArea = ar;
        }
        return maxArea;
    }

    // TLE - Brute Force
    // public int maxArea(int[] height) {
    // int maxArea = 0;
    // for (int i = 0; i < height.length; i++) {
    // for (int j = i + 1; j < height.length; j++) {
    // if ((j - i) * Math.min(height[i], height[j]) > maxArea)
    // maxArea = (j - i) * Math.min(height[i], height[j]);
    // }
    // }
    // return maxArea;
    // }
}
