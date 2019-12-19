package twoSum;

/**
 * @author kaizen
 * @date 2019/12/19
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            int s = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == s) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
