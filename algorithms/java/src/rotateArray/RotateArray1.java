package rotateArray;

/**
 * @author kaizen
 * @date 2019/12/16
 */
public class RotateArray1 {

    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int j = nums.length - 1;
            while (j > 0) {
                int tmp = nums[j];
                nums[j] = nums[--j];
                nums[j] = tmp;
            }
        }
    }
}
