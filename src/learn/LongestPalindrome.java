package learn;

/**
 * 给定一个字符串 s，找到 s 中最长的回文子串。
 * 1、暴力破解法
 */
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        String result = "";

        int length = s.length();
        int max = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                String temp = s.substring(i, j);
                if (isPalinddrome(temp) && temp.length() > max) {
                    result = temp;
                    max = Math.max(result.length(), max);
                }
            }
        }

        return result;

    }

    public boolean isPalinddrome(String s) {

        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if(s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }

}
