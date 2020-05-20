package demo16;


import test.Generate;

import java.util.Arrays;

/**
 * 16.给定一个包括n个整数的数组nums和一个目标值target。找出nums中的三个整数，使得它们的和与target最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        for (int i = 0; i < 10; i++) {
            int[] arr = Generate.getInt(6, 10);
            System.out.println(Arrays.toString(arr));
            System.out.println(slt.threeSumClosest(arr, 15));
        }
    }
}
