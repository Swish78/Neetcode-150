import java.util.Arrays;

public class Solution {

    public static int maxArea(int[] height) {
        // Calculate the maximum area of a rectangle that can be formed by two adjacent bars in the array.
        int water = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            // Find the minimum height of the two adjacent bars.
            int h = Math.min(height[i], height[j]);
            // Calculate the area of the rectangle formed by the two bars.
            water = Math.max(water, (j - i) * h);
            // Increment the index of the bar with the smaller height.
            if (height[i] <= h) {
                i++;
            } else {
                j--;
            }
        }
        return water;
    }

}
