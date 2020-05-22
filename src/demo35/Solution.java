package demo35;

/**
 * 35. 搜索插入位置 #easy
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 39.3 MB , 在所有 Java 提交中击败了 5.55% 的用户
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int start = 0;
        int end = nums.length - 1;
        if (target <= nums[0]) return 0;
        else if (target > nums[end]) return end + 1;
        while (true) {
            int mid = (start + end) / 2;
            if (nums[mid] > target) {
                if (start + 1 == end) return start;
                end = mid;
            } else if (nums[mid] < target) {
                if (start + 1 == end) return end;
                start = mid;
            } else return mid;
        }
    }
}