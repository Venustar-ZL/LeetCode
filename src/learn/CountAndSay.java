package learn;

/**
 * 报数序列
 */
public class CountAndSay {

    public static String countAndSay(int n) {
        String str = "1";
        for (int i = 2; i <= n; i++) {
            StringBuilder preStr = new StringBuilder();
            int count = 0;
            //定义left、right包含相同数字
            int left = 0;
            int right = 0;
            for (; right < str.length(); right++) {
                if (str.charAt(right) == str.charAt(left)) {
                    count++;
                    if (right == str.length() - 1) {
                        preStr.append(count).append(str.charAt(left));
                    }
                }
                else {
                    preStr.append(count).append(str.charAt(left));
                    left = right;
                    right--;
                    count = 0;
                }
            }
            str = preStr.toString();
        }
        return str;
    }

}
