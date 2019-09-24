package learn;

/**
 * 字符串转换成整数(atoi)
 * 不支持32位环境
 * long
 */
public class MyAtoi {

    public static int myAtoi(String str) {
        str = str.trim();
        if (str == null || str.length() == 0) {
            return 0;
        }
        int length = str.length();
        int start = 0;
        int sign = 1;
        long res = 0;
        char firstChar = str.charAt(0);
        if (firstChar == '+') {
            sign = 1;
            start++;
        }
        else if (firstChar == '-') {
            sign = -1;
            start++;
        }

        for (int i = start; i < length; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return (int) res * sign;
            }
            res = res * 10 + str.charAt(i) - '0';
            if (sign == 1 && res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && res > Integer.MAX_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int) res * sign;
    }

}
