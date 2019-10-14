package learn;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回杨辉三角的第K行
 */
public class GetRow {

    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        for (int row = 0; row <= rowIndex; row++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= row; j++) {
                if (j == 0 || j == row ) {
                    temp.add(1);
                }
                else {

                    int left = res.get(j -1);
                    int right = res.get(j);
                    temp.add(left + right);
                }
            }
            res = temp;
        }
        return res;
    }

}
