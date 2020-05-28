package n00.demo7;

/**
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 45.06% 的用户
 * 内存消耗 : 37.4 MB , 在所有 Java 提交中击败了 5.33% 的用户
 */
public class Solution {
    public int reverse(int x) {
        boolean sign;
        StringBuilder sb = new StringBuilder();
        if (x > 0) sign = true;
        else if (x < 0) {
            sign = false;
            x = -x;
        } else return 0;
        sb.append(x).reverse();
        if (sb.length() > 10) return 0;
        long x1 = Long.parseLong(sb.toString());
        if (sign) {
            if (x1 > 2147483647) return 0;
            return (int) x1;
        } else {
            if ((x1 - 1) > 2147483647) return 0;
            return (int) -x1;
        }
    }
}
