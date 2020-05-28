package n10.demo12;

import test.Generate;

/**
 * 12.给定一个整数，将其转为罗马数字。输入确保在 1 到 3999 的范围内。
 */
public class test {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int tmp = Generate.getInt() % 4000;
            if (tmp < 0) tmp = -tmp;
            Solution slt = new Solution();
            System.out.println(tmp+" ");
            System.out.println(slt.intToRoman(tmp));
        }
    }
}
