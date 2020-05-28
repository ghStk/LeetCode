package n50.demo53;

/**
 * #贪心
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 95.00% 的用户
 * 内存消耗 : 39.8 MB , 在所有 Java 提交中击败了 37.08% 的用户
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length;
        if (length == 0) return Integer.MIN_VALUE;
        int start = 0;
        int max = nums[0];
        while (start < length && nums[start] <= 0) start++; //找到第一个正数位置
        if (start == length) { //都是负数则找出最大项
            for (int x : nums) {
                if (x > max) max = x;
            }
            return max;
        }
        int sum = nums[start];
        max = sum;
        for (int i = start + 1; i < length; i++) {
            int tmp = nums[i];
            if (tmp < 0) {
                if ((sum += tmp) < 0) sum = 0;
            } else {
                if ((sum += tmp) > max) max = sum;
            }
        }
        return max;
    }
}