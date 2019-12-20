package twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kaizen
 * @date 2019/12/20
 */
public class TwoSum3 {

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int s = target - nums[i];
            if (map.containsKey(nums[i])) {
                if (map.get(nums[i]) != i) {
                    res[0] = map.get(nums[i]);
                    res[1] = i;
                    return res;
                }
            }
            map.put(s, i);
        }
        return res;
    }
}
