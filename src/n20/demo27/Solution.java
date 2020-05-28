package n20.demo27;

/**
 * 27. 移除元素 #easy
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 38 MB , 在所有 Java 提交中击败了 5.68% 的用户
 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int p0 = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                p0--;
                while (p0 > 0 && nums[p0] == val) p0--;
                nums[i] = nums[p0];
            }
            if (p0 <= i) return i;
        }
        return p0;
    }
}