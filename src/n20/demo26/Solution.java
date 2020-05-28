package n20.demo26;

//import java.util.Arrays;

/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 98.65% 的用户
 * 内存消耗 : 41.5 MB , 在所有 Java 提交中击败了 5.74% 的用户
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length;
        int p0 = 1;
        for (int p1 = 1; p1 < nums.length; p1++) {
            if (nums[p1] == nums[p1 - 1]) { //与前一个相等
                length--;
            } else { //与前一个不相等
                nums[p0] = nums[p1];
                p0++;
            }
        }
//        System.out.println(Arrays.toString(nums));
        return length;
    }
}
