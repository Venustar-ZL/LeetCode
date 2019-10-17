package learn;

/**
 * 给定一个Excel表格中的列名称
 * 返回其相应的列序号
 */
public class TitleToNumber {

    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            int num = temp - 65;
            res = res * 26 + num;
        }
        return res;
    }

}
