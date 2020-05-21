package demo26;

/**
 * 26.给定一个排序数组，你需要在 原地 删除重复出现的元素，
 * 使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        int[] a = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(slt.removeDuplicates(a));
    }
}
