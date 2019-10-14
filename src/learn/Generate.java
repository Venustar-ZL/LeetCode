package learn;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 生成给定行数的杨辉三角
 */
public class Generate {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int row = 1; row <= numRows; row++) {

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < row; j++) {

                if (j == 0 || j == row - 1) {
                    list.add(1);
                }
                else {
                    int left = res.get(row - 1).get(j - 1);
                    int right = res.get(row - 1).get(j);
                    list.add(left + right);
                }

            }

            res.add(list);

        }
        return res;
    }

}
