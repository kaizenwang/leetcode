package letterCombinationsOfAPhoneNumber;

import java.util.Collections;
import java.util.List;

/**
 * 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 *
 * @author kaizen
 * @date 2020/5/25
 */
public class LetterCombinationsOfAPhoneNumber {

    public List<String> letterCombinations(String digits) {
        String[] numbers = new String[10];
        numbers[0] = "";
        numbers[1] = "";
        numbers[2] = "abc";
        numbers[3] = "def";
        numbers[4] = "ghi";
        numbers[5] = "jkl";
        numbers[6] = "mno";
        numbers[7] = "pqrs";
        numbers[8] = "tuv";
        numbers[9] = "wxyz";
        int length = digits.toCharArray().length;


        return Collections.emptyList();
    }
}
