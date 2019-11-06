package removeDuplicatesFromSortedArray;

/**
 * @author kaizen
 * @date 2019/11/6
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length >= 2) {
            int count = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i - 1] != nums[i]) {
                    nums[count++] = nums[i];
                }
            }
            return count;
        }
        return nums.length;
    }
}
