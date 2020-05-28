package n00.demo6;

/**
 * 6.将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
//        String s = Generate.getString(25);
        System.out.println(slt.convert("LEETCODEISHIRING",3));
    }
}


