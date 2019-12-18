package mergeSortedArray;

/**
 * @author kaizen
 * @date 2019/12/18
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int max = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            nums1[max--] = nums1[p1] < nums2[p2] ? nums2[p2--] : nums1[p1--];
        }
        while (p2 >= 0){
            nums1[max--] = nums2[p2--];
        }
    }
}
