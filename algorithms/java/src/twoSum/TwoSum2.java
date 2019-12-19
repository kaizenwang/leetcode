package twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author kaizen
 * @date 2019/12/19
 */
public class TwoSum2 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(s, i);
        }
        return null;
    }
}
