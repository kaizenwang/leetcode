package removeDuplicatesFromSortedArray;

/**
 * @author kaizen
 * @date 2019/11/6
 * @author https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
class RemoveDuplicatesFromSortedArray {

  int removeDuplicates(int[] nums) {
    if (nums.length < 2) {
      return nums.length;
    }
    int count = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[count++] = nums[i];
      }
    }
    return count;
  }
}
