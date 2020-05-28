package n00.demo5;

import test.Generate;

/**
 * 5.给定一个字符串 s，找到 s 中最长的回文子串。
 * 你可以假设 s 的最大长度为 1000。
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        for (int i = 0; i < 20; i++) {
            String s = Generate.getString(10);
            System.out.print(s + " ");
            System.out.println(slt.longestPalindrome(s));
        }
    }
}
