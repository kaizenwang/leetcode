package moveZeroes;

/**
 * @author kaizen
 * @date 2019/12/4
 */
public class MoveZeroes {
  public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        if (i != j) {
          nums[j] = nums[i];
        }
        j++;
      }
    }
    for (int i = j; i < nums.length; i++) {
      nums[i] = 0;
    }
  }
}
