package rotateArray;

/**
 * @author kaizen
 * @date 2019/11/6
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
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
        for (int i = len - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = last;
    }
}
