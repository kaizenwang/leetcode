package threeSum;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/12/8
 */
public class ThreeSumTest {

  private ThreeSum2 threeSum;

  @Before
  public void init() {
    threeSum = new ThreeSum2();
  }

  @Test
  public void threeSum() {
    int[] nums = new int[] {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(-1, -1, 2));
    expected.add(Arrays.asList(-1, 0, 1));
    assertThat(threeSum.threeSum(nums), is(expected));
  }

  @Test
  public void testThreeSum() {
    int[] nums = new int[] {0, 0, 0};
    List<List<Integer>> expected = new ArrayList<>();
    expected.add(Arrays.asList(0, 0, 0));
    assertThat(threeSum.threeSum(nums), is(expected));
  }

  @Test
  public void test1ThreeSum() {
    int[] nums = new int[] {1, 2, -2, -1};
    List<List<Integer>> expected = new ArrayList<>();
    assertThat(threeSum.threeSum(nums), is(expected));
  }
}
