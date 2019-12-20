package plusOne;

/**
 * @author kaizen
 * @date 2019/12/20
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int[] s = new int[digits.length + 1];
        boolean flag = true;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (flag) {
                int c = digits[i] + 1;
                if (c < 10) {
                    flag = false;
                    s[i + 1] = c;
                } else {
                    s[i + 1] = 0;
                    s[i] = 1;
                }
            } else {
                s[i + 1] = digits[i];
            }
        }
        if (s[0] == 0) {
            System.arraycopy(s, 1, digits, 0, s.length - 1);
            return digits;
        }
        return s;
    }
}
