package learn;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个正整数
 * 返回它在 Excel 表中相对应的列名称
 */
public class ConvertToTitle {

    // 对n循环求余
    public String convertToTitle(int n) {
        if (n == 0) {
            return null;
        }
        StringBuilder s = new StringBuilder();
        Map<Integer,Character> map = new HashMap<>();
        map.put(0,'Z');
        map.put(1,'A');
        map.put(2,'B');
        map.put(3,'C');
        map.put(4,'D');
        map.put(5,'E');
        map.put(6,'F');
        map.put(7,'G');
        map.put(8,'H');
        map.put(9,'I');
        map.put(10,'J');
        map.put(11,'K');
        map.put(12,'L');
        map.put(13,'M');
        map.put(14,'N');
        map.put(15,'O');
        map.put(16,'P');
        map.put(17,'Q');
        map.put(18,'R');
        map.put(19,'S');
        map.put(20,'T');
        map.put(21,'U');
        map.put(22,'V');
        map.put(23,'W');
        map.put(24,'X');
        map.put(25,'Y');
        while (n != 0) {
            int m = n % 26;
            if (m == 0) {
                s.append(map.get(m));
                n = n / 26 - 1;
            }
            else {
                s.append(map.get(m));
                n = n / 26;
            }
        }
        return s.reverse().toString();
    }

}
