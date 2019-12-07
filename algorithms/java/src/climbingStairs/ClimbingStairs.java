package climbingStairs;

/**
 * @author kaizen
 * @date 2019/12/7
 */
public class ClimbingStairs {
  public int climbStairs(int n) {
    if (n <= 2) {
      return n;
    } else {
      return climbStairs(n - 1) + climbStairs(n - 2);
    }
  }
}
