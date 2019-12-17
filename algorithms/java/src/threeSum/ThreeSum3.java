package threeSum;

import java.util.*;

/**
 * @author kaizen
 * @date 2019/12/17
 */
public class ThreeSum3 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; k++) {
            int i = k + 1, j = nums.length - 1;
            if (nums[k] > 0) {
                break;
            }
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }
            while (i < j) {
                int s = nums[k] + nums[i] + nums[j];
                if (s == 0) {
                    results.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else if (s < 0) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return results;
    }
}
