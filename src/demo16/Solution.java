package demo16;

import java.util.Arrays;

/**
 * 执行用时 : 5 ms , 在所有 Java 提交中击败了 96.01% 的用户
 * 内存消耗 : 39.5 MB , 在所有 Java 提交中击败了 6.82% 的用户
 */
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int length = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        int delta = Math.abs(res - target);
        Arrays.sort(nums);
        for (int i = 0; i < length - 2; i++) {
            int c0 = nums[i];
            int z1 = i + 1;
            int z2 = length - 1;
            while (z1 < z2) {
                int c1 = nums[z1];
                int c2 = nums[z2];
                int tmpSum = c0 + c1 + c2 - target;
                if (tmpSum == 0) return target;
                else if (tmpSum > 0) while (--z2 > z1 && nums[z2] == c2) ;
                else while (++z1 < z2 && nums[z1] == c1) ;
                if (delta > Math.abs(tmpSum)) {
                    res = c0 + c1 + c2;
                    delta = Math.abs(tmpSum);

                }
            }
        }
        return res;
    }
}