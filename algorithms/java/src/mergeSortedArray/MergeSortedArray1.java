package mergeSortedArray;

import java.util.Arrays;

/**
 * @author kaizen
 * @date 2019/12/18
 */
public class MergeSortedArray1 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int max = m + n - 1;
        int p = n - 1;
        while (p >= 0) {
            nums1[max--] = nums2[p--];
        }
        Arrays.sort(nums1);
    }
}
