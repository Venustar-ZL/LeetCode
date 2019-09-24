package learn;

/**
 * 判断一个数是否是回文数
 */
public class IsPalindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        char[] temp = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            temp[str.length() - i -1] = str.charAt(i);
        }
        String res = String.valueOf(temp);
        if (str.equals(res)) {
            return true;
        }
        else {
            return false;
        }
    }
}
