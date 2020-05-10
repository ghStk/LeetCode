package demo9;

import test.Generate;

/**
 * 9.判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 进阶:你能不将整数转为字符串来解决这个问题吗？
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        int[] arr = Generate.getInt(10);
        arr[0] = 10001;
        arr[1] = 215484512;
        for (int x : arr) {
            System.out.print("num= " + x+" isPalindrome?:");
            System.out.println(slt.isPalindrome(x));
        }
    }
}
