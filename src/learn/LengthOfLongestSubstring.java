package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个字符串，返回其中不含有重复字符的 最长子串 的长度。
 *
 * 滑动窗口法
 */
public class LengthOfLongestSubstring {

    /**
     *
     * @param s 传入的字符串
     * @return 返回的不含有重复字符的最长子串
     */
    public int lengthOfLongestSubstring(String s) {

        int result = 0;
        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int start = 0, end = 0; end < length; end++) {
            char temp = s.charAt(end);
            if (map.containsKey(temp)) {
                start = Math.max(map.get(temp), start);
            }
            result = Math.max(result, end - start + 1);
            map.put(s.charAt(end), end + 1);
        }

        return result;

    }

}
