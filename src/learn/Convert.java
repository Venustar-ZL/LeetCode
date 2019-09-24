package learn;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 此题解法思路秀的我头皮发麻，通过标志位的转换来控制+1、-1
 */
public class Convert {
    /**
     *
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        int len = Math.min(s.length(), numRows);
        String[] rows = new String[len];
        for (int i = 0; i < len; i++) {
            rows[i] = "";
        }
        int loc = 0;
        boolean down = false;

        for (int i = 0; i < s.length(); i++) {
            rows[loc] += s.substring(i, i + 1);
            if (loc == 0 || loc == numRows -1) {
                down = !down;
            }
            loc += down ? 1 : -1;
        }

        String result = "";
        for (String row : rows) {
            result += row;
        }

        return result;

    }

}


