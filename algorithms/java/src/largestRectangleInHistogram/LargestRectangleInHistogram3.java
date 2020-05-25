package largestRectangleInHistogram;

/**
 * @author kaizen
 * @date 2019/12/29
 */
public class LargestRectangleInHistogram3 {
    public int largestRectangleArea(int[] heights) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = i; j < heights.length; j++) {
                min = Math.min(min, heights[j]);
                max = Math.max(max, min * (j - i + 1));
            }
        }
        return max;
    }
}
