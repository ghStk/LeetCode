package demo11;

/**
 * 执行用时 : 822 ms , 在所有 Java 提交中击败了 5.01% 的用户
 * 内存消耗 : 39.6 MB , 在所有 Java 提交中击败了 64.29% 的用户
 */
class Solution {
    public int maxArea(int[] height) {
        int i, j;
        int length = height.length;
        int max = 0; //最大Area
        int tmp_Max = 0; //当前i循环，最大Area
        int max_h = 0; //已经循环过的i中，最大height


        for (i = 0; i <= length; i++) {
            tmp_Max = 0;
            for (j = length - 1; j >= i + 1; j--) {
                int h = Math.min(height[i], height[j]);
                if (tmp_Max < (h * (j - i))) tmp_Max = h * (j - i);
            }
            if (max < tmp_Max) max = tmp_Max;
        }
        return max;
    }
}
