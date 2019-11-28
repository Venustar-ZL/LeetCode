package learn;

/**
 * @ClassName: Find
 * @Description: 二维数组中的查找
 * @Date: 2019-11-28 16:29
 * @Author: ZhangLei
 * version: 1.0
 **/
public class Find {

    public boolean Find(int target, int [][] array) {
        int row = array.length;
        int col = array[0].length;
        int i = row - 1;
        int j = 0;
        while (i >= 0 && j < col) {
            if (target < array[i][j]) {
                i--;
            }
            else if (target > array[i][j]) {
                j++;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
