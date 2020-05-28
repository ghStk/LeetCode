package n00.demo9;

import test.Generate;

/**
 * 9.判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 进阶:你能不将整数转为字符串来解决这个问题吗？
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
//        int[] arr = Generate.getInt(10);
//        for (int x : arr) {
//            System.out.print("num= " + x+" isPalindrome?:");
//            System.out.println(slt.isPalindrome(x));
//        }

        //测试随机数是回文的概率
        int count = 0;
        int tmp;
        do {
            tmp = Generate.getInt();
            count++;
        } while (!slt.isPalindrome(tmp) && count <= 999999);
        System.out.println(tmp);
        System.out.println(count);
    }
}

