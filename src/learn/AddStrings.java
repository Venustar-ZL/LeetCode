package learn;

/**
 * @ClassName: AddStrings
 * @Description: 两个字符串之和
 * @Date: 2019-11-19 14:34
 * @Author: ZhangLei
 * version: 1.0
 **/
public class AddStrings {

    // 长度不一致 进位
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();
        if (num1 == null) {
            return num2;
        }
        if (num2 == null) {
            return num1;
        }
        int carry = 0;
        int len1 = num1.length();
        int len2 = num2.length();
        int i = len1 - 1;
        int j = len2 - 1;
        while (i >= 0 || j >= 0) {
            char a = '0';
            char b = '0';
            if (i >= 0) {
                a = num1.charAt(i--);
            }
            if (j >= 0) {
                b = num2.charAt(j--);
            }
            int temp =  a + b + carry - 96;
            if (temp >= 10) {
                carry = 1;
                temp %= 10;
            }
            else {
                carry = 0;
            }
            str.append(temp);
        }
        if (carry == 1) {
            str.append(carry);
        }
        return str.reverse().toString();
    }

}
