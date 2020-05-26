package letterCombinationsOfAPhoneNumber;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * 电话号码的字母组合
 * https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 *
 * @author kaizen
 * @date 2020/5/25
 */
public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void testLetterCombinations() {
        LetterCombinationsOfAPhoneNumber phoneNumber = new LetterCombinationsOfAPhoneNumber();
        String[] expected = {"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"};
        List<String> strings = phoneNumber.letterCombinations("23");
        Assert.assertArrayEquals(expected, strings.toArray());
    }
}
