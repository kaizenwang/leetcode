package climbingStairs;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author kaizen
 * @date 2019/12/7
 */
public class ClimbingStairsTest {

  private ClimbingStairs climbingStairs;

  @Before
  public void setUp() {
    climbingStairs = new ClimbingStairs();
  }

  @Test
  public void testClimbStairs() {
    assertEquals(2, climbingStairs.climbStairs(2));
  }

  @Test
  public void test1ClimbStairs() {
    assertEquals(3, climbingStairs.climbStairs(3));
  }

  @Test
  public void test2ClimbStairs() {
    assertEquals(8, climbingStairs.climbStairs(5));
  }

  @Test
  public void test3ClimbStairs() {
    assertEquals(1836311903, climbingStairs.climbStairs(45));
  }
}
