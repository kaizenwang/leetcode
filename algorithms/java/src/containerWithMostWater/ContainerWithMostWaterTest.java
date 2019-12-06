package containerWithMostWater;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/12/6
 */
public class ContainerWithMostWaterTest {

  private ContainerWithMostWater1 containerWithMostWater;

  @Before
  public void init() {
    containerWithMostWater = new ContainerWithMostWater1();
  }

  @Test
  public void maxArea() {
    int[] height = new int[] {1, 8, 6, 2, 5, 4, 8, 3, 7};
    Assert.assertEquals(49, containerWithMostWater.maxArea(height));
  }
}
