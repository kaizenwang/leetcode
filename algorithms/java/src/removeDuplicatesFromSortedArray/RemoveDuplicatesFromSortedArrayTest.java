package removeDuplicatesFromSortedArray;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author kaizen
 * @date 2019/11/6
 */
public class RemoveDuplicatesFromSortedArrayTest {

  private RemoveDuplicatesFromSortedArray3 fun;

  @Before
  public void init() {
    fun = new RemoveDuplicatesFromSortedArray3();
  }

  @Test
  public void testRemoveDuplicates() {
    int[] nums = new int[] {1, 1, 2};
    int len = fun.removeDuplicates(nums);
    int[] expected = new int[] {1, 2};
    for (int i = 0; i < len; i++) {
      Assert.assertEquals(expected[i], nums[i]);
    }
  }

  @Test
  public void test1RemoveDuplicates() {
    int[] nums = new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
    int len = fun.removeDuplicates(nums);
    int[] expected = new int[] {0, 1, 2, 3, 4};
    for (int i = 0; i < len; i++) {
      Assert.assertEquals(expected[i], nums[i]);
    }
  }

  @Test
  public void test2RemoveDuplicates() {
    int[] nums = new int[] {0, 1, 1, 2};
    int len = fun.removeDuplicates(nums);
    int[] expected = new int[] {0, 1, 2};
    for (int i = 0; i < len; i++) {
      Assert.assertEquals(expected[i], nums[i]);
    }
  }
}
