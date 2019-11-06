package removeDuplicatesFromSortedArray;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author kaizen
 * @date 2019/11/6
 */
public class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicatesFromSortedArray array = new RemoveDuplicatesFromSortedArray();
        int[] nums = new int[]{1, 1, 2};
        int len = array.removeDuplicates(nums);
        int[] expected = new int[]{1, 2};
        for (int i = 0; i < len; i++) {
            Assert.assertEquals(expected[i], nums[i]);
        }
    }
}
