package demo11;

/**
 * 执行用时 : 108 ms , 在所有 Java 提交中击败了 29.50% 的用户
 * 内存消耗 : 40.3 MB , 在所有 Java 提交中击败了 6.43% 的用户
 */
class Solution {
    public int maxArea(int[] height) {
        int i, j;
        int length = height.length;
        int max = 0; //最大Area
        int max_h = 0; //已经循环过的i中，最大height
        int tmp_Max = 0; //当前i循环，最大Area
        int tmp_jMax; //当前j循环，最大height

        for (i = 0; i <= length - 1; i++) {
            if (height[i] == 0) continue;
            if (height[i] > max_h) { //[Sort] 如果i出现新高，才有必要继续
                max_h = height[i];
                tmp_Max = 0;
                tmp_jMax = 0;
                for (j = length - 1; j >= i + 1; j--) {
                    if (height[j] < tmp_jMax) continue; //[Sort]
                    tmp_jMax = height[j];
                    int h = Math.min(height[i], height[j]);
                    if (tmp_Max < (h * (j - i))) tmp_Max = h * (j - i);
                }
            }
            if (max < tmp_Max) max = tmp_Max;
        }
        return max;
    }
}
