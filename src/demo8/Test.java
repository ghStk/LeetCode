package demo8;

/**
 * 8.请你来实现一个 atoi 函数，使其能将字符串转换成整数。
 * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
 * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
 * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
 * 在任何情况下，若函数不能进行有效的转换时，请返回 0。
 */
public class Test {
    public static void main(String[] args) {
        Solution slt = new Solution();
        System.out.println(slt.myAtoi("    +12323..e"));
    }
}
