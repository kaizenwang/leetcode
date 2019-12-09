package threeSum;

import java.util.*;

/**
 * @author kaizen
 * @date 2019/12/8
 */
public class ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    for (int i = 0; i < nums.length - 2; i++) {
      for (int j = i + 1; j < nums.length - 1; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if ((nums[i] + nums[j] + nums[k]) == 0) {
            List<Integer> integers = Arrays.asList(nums[i], nums[j], nums[k]);
            Collections.sort(integers);
            if (!res.contains(integers)) {
              res.add(integers);
            }
          }
        }
      }
    }
    return res;
  }
}
