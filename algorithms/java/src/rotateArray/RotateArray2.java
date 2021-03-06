package rotateArray;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @author kaizen
 * @date 2019/12/16
 */
public class RotateArray2 {

    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }
}
