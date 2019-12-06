package containerWithMostWater;

/**
 * @author kaizen
 * @date 2019/12/6
 */
public class ContainerWithMostWater {

  public int maxArea(int[] height) {
    int max = 0;
    for (int i = 0; i < height.length - 1; i++) {
      for (int j = i + 1; j < height.length; j++) {
        int min = Math.min(height[i], height[j]);
        int area = area(min, j - i);
        max = Math.max(max, area);
      }
    }
    return max;
  }

  private int area(int i, int i1) {
    return i * i1;
  }
}
