package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kaizen
 * @date 2019/12/19
 */
public class TwoSum1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            map.put(s, i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i]) != i) {
                    return new int[]{map.get(nums[i]), i};
                }
            }
        }
        return null;
    }
}
