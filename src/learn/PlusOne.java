package learn;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数
 * 在该数的基础上加一。
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        int index = len - 1;
        while (index >= 0) {
            if (digits[index] == 9) {
                digits[index] = 0;
                index--;
            }
            else {
                digits[index]++;
                break;
            }
        }
        if (index < 0) {
            digits = new int[len + 1];
            digits[0] = 1;
        }
        return digits;
    }

}
