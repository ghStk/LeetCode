package n10.demo15;

import java.util.List;

/**
 * 15.给你一个包含n个整数的数组nums,判断nums中是否存在三个元素a,b,c,使得a+b+c=0?
 * 请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 */
public class Test {
    public static void main(String[] args) {
        Solution2 slt = new Solution2();
        int[] in = {-4,-2,-2,-2,0,1,2,2,2,3,3,4,4,6,6};
        List<List<Integer>> lst = slt.threeSum(in);
        for (List<Integer> l0 : lst) {
            for (int l1 : l0) {
                System.out.print(l1 + " ");
            }
            System.out.println();
        }
    }
}
