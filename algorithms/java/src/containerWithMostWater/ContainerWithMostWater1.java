package containerWithMostWater;

/**
 * @author kaizen
 * @date 2019/12/6
 */
public class ContainerWithMostWater1 {

  public int maxArea(int[] height) {
    int max = 0, i = 0, j = height.length - 1;
    while (i < j) {
      int min = height[i] > height[j] ? height[j--] : height[i++];
      int area = (j - i + 1) * min;
      max = Math.max(max, area);
    }
    return max;
  }
}
