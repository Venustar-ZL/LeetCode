package learn;

/**
 * @ClassName: IsIsomorphic
 * @Description: 判断两个字符串是否同构
 * @Date: 2019-10-30 09:14
 * @Author: ZhangLei
 * version: 1.0
 **/
public class IsIsomorphic {

    public boolean isIsomorphic(String s, String t) {
        int len = s.length();
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for (int i = 0; i < len; i++) {
            if (s.indexOf(ch1[i]) != t.indexOf(ch2[i])) {
                return false;
            }
        }
        return true;
    }

}
