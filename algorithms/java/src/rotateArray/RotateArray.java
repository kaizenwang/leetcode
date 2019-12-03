package rotateArray;

/**
 * @author kaizen
 * @date 2019/11/6
 * https://leetcode-cn.com/problems/rotate-array/
 */
class RotateArray {

  void rotate(int[] nums, int k) {
    int len = nums.length;
    if (len == 0) {
      return;
    }
    k = k % len;
    while (k > 0) {
      cal(nums, len, nums[len - 1]);
      k--;
    }
  }

  private void cal(int[] nums, int len, int last) {
    if (len - 1 >= 0) {
      System.arraycopy(nums, 0, nums, 1, len - 1);
    }
    nums[0] = last;
  }
}
