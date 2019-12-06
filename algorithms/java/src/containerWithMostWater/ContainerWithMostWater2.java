package containerWithMostWater;

/**
 * @author kaizen
 * @date 2019/12/6
 */
public class ContainerWithMostWater2 {

  public int maxArea(int[] height) {
    int area = 0, maxArea = 0, i = 0, j = height.length - 1;
    while (i < j) {
      if (height[i] <= height[j]) {
        area = height[i] * (j - i);
        i++;
      } else {
        area = height[j] * (j - i);
        j--;
      }
      if (area > maxArea) {
        maxArea = area;
      }
    }
    return maxArea;
  }
}
