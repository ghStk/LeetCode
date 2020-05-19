package demo15;

/**
 * 15.给你一个包含n个整数的数组nums,判断nums中是否存在三个元素a,b,c,使得a+b+c=0?
 * 请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        slt.threeSum(new int[] {-1,0,1,2,-1,-4});
    }
}
