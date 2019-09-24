package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 * 采用贪心思想求解
 */
public class IntToRoman {

    public String intToRoman(int num) {

        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder s = new StringBuilder();

        int index = 0;
        while (index < 13) {
            while (num >= nums[index]) {
                s.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        return s.toString();
    }

}
