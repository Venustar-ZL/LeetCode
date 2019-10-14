package learn;

/**
 * 判断一个字符串是否是回文串 只关注字母和数字 忽略大小写
 */
public class StringIsPalindrome {

    // 思路：将字符串中的字母和数字提取出来 忽略大小写
    public boolean isPalindrome(String s) {
        if (s == null ) {
            return true;
        }
        s = s.replaceAll("[^a-z^A-Z^0-9]", "").toUpperCase();
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
