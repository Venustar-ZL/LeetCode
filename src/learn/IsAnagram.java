package learn;

/**
 * @ClassName: IsAnagram
 * @Description: 判断两个字符串是否为字母异位词 即判断两个字符串出现的字母及其个数是否相同
 * @Date: 2019-10-31 14:20
 * @Author: ZhangLei
 * version: 1.0
 **/
public class IsAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] sIntArray = new int[26];
        int[] tIntArray = new int[26];
        for (char c : s.toCharArray()) {
            sIntArray[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            tIntArray[c - 'a']++;
        }
        for (int i = 0; i < sIntArray.length; i++) {
            if (sIntArray[i] != tIntArray[i]) {
                return false;
            }
        }
        return true;
    }

}
