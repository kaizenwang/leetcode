package moveZeroes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/12/4
 */
public class MoveZeroesTest {

  private MoveZeroes2 moveZeroes;

  @Before
  public void init() {
    moveZeroes = new MoveZeroes2();
  }

  @Test
  public void testMoveZeroes() {
    int[] nums = new int[] {0, 1, 0, 3, 12};
    moveZeroes.moveZeroes(nums);
    int[] expected = new int[] {1, 3, 12, 0, 0};
    assertArrayEquals(expected, nums);
  }
}
