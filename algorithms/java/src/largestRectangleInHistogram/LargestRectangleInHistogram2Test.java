package largestRectangleInHistogram;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/12/26
 */
public class LargestRectangleInHistogram2Test {

    private LargestRectangleInHistogram2 largestRectangleInHistogram;

    @Before
    public void init(){
        largestRectangleInHistogram = new LargestRectangleInHistogram2();
    }

    @Test
    public void largestRectangleArea() {
        int[] test = new int[]{2, 1, 2};
        assertEquals(3, largestRectangleInHistogram.largestRectangleArea(test));
    }
}