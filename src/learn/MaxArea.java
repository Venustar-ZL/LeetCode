package learn;

/**
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 */
public class MaxArea {

    public int maxArea(int[] height) {

        // 暴力破解法
        /**
        if (height.length < 2) {
            return 0;
        }
        int area = 0;
        int len = height.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int h = Math.min(height[i], height[j]);
                int l = j - i;
                area = Math.max(area, h * l);
            }
        }
        return area;
        */

        // 双指针法
        if (height.length < 2) {
            return 0;
        }
        int length = height.length;
        int l = 0;
        int r = length - 1;
        int area = 0;
        while (l < r) {
            area = Math.max(area, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            }
            else {
                r++;
            }
        }
        return area;
    }

}
