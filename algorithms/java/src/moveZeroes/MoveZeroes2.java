package moveZeroes;

/**
 * @author kaizen
 * @date 2019/12/4
 */
public class MoveZeroes2 {
  public void moveZeroes(int[] nums) {
    int j = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        j++;
      }
    }
  }
}