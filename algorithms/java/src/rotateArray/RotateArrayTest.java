package rotateArray;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/11/6
 */
public class RotateArrayTest {

    private RotateArray rotateArray;

    @Before
    public void init() {
        this.rotateArray = new RotateArray();
    }

    @Test
    public void testRotateArray() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expecteds = new int[]{5, 6, 7, 1, 2, 3, 4};
        rotateArray.rotate(nums, 3);
        assertArrayEquals(expecteds, nums);
    }


    @Test
    public void test1RotateArray() {
        int[] nums = new int[]{-1,-100,3,99};
        int[] expecteds = new int[]{3,99,-1,-100};
        rotateArray.rotate(nums, 2);
        assertArrayEquals(expecteds, nums);
    }
}
