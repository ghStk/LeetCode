package n00.demo1;

/**
 * 执行用时 : 72 ms , 在所有 Java 提交中击败了 26.92% 的用户
 * 内存消耗 : 39.5 MB , 在所有 Java 提交中击败了 5.06% 的用户
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}