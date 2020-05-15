package demo13;

import test.Generate;

/**
 * 13.给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 */
public class Test {
    public static void main(String[] args) {
        demo13.Solution slt = new demo13.Solution();

        for (int i = 0; i < 10; i++) {
            demo12.Solution slt12 = new demo12.Solution();
            int tmp = Generate.getInt() % 4000;
            if (tmp < 0) tmp = -tmp;
            String roman = slt12.intToRoman(tmp);
            int res = slt.romanToInt(roman);
            System.out.print("num=" + tmp);
            System.out.print(" Roman=" + roman);
            System.out.print(" Res=" + res);
            System.out.println(" " + (tmp == res));
        }
    }
}
