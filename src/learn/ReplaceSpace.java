package learn;

/**
 * @ClassName: ReplaceSpace
 * @Description: 替换空格
 * @Date: 2019-11-28 16:56
 * @Author: ZhangLei
 * version: 1.0
 **/
public class ReplaceSpace {

    public String replaceSpace(StringBuffer str) {
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toString().toCharArray()) {
            if (c == ' ') {
                sb.append("%20");
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
