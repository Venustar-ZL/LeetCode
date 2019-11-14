package learn;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @ClassName: FirstUniqChar
 * @Description: 返回给定字符串中第一个不重复字符的索引
 * @Date: 2019-11-14 15:07
 * @Author: ZhangLei
 * version: 1.0
 **/
public class FirstUniqChar {

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int len = s.length();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(s.charAt(i))) {
                int count = map.get(s.charAt(i));
                count++;
                map.replace(s.charAt(i), count);
            }
            else {
                map.put(s.charAt(i), 1);
            }
        }
        System.out.println(map.entrySet());
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            char ch = (Character) entry.getKey();
            int index = (Integer) entry.getValue();
            if (index == 1) {
                return s.indexOf(ch);
            }
        }
        return -1;
    }

}
