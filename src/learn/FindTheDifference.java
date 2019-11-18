package learn;


/**
 * @ClassName: FindTheDifference
 * @Description: 找不同
 * @Date: 2019-11-14 15:46
 * @Author: ZhangLei
 * version: 1.0
 **/
@SuppressWarnings("all")
public class FindTheDifference {

    // t是s随机重排的 并添加了一个字母（此字母可能存在于s或不存在）
    /*
    // 思路1：字符替换
    public char findTheDifference(String s, String t) {
        for (Character c : s.toCharArray()) {
            t = t.replaceFirst(c.toString(), "");
        }
        return t.toCharArray()[0];
     }

     */

    // 思路2：ASCII差值
    public char findTheDifference(String s, String t) {
        int sCount = 0;
        int tCount = 0;
        for (Character c : s.toCharArray()) {
            sCount += c;
        }
        for (Character c : t.toCharArray()) {
            tCount += c;
        }
        return (char)(tCount - sCount);
    }

}