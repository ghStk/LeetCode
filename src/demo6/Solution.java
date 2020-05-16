package demo6;

/**
 * 执行用时 : 3 ms , 在所有 Java 提交中击败了 99.45% 的用户
 * 内存消耗 : 39.7 MB , 在所有 Java 提交中击败了 10.00% 的用户
 */
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) return s; //只有1行,直接输出
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        int cycle = 2 * numRows - 2; //每周期的数量
        //i行数
        for (int i = 0; i < numRows; i++) {
            int index = i;
            if (i > 0 && i < numRows - 1) { //不是首行或者尾行
                while (index < length) {
                    sb.append(s.charAt(index));
                    index += cycle - 2 * i;
                    if (index < length) sb.append(s.charAt(index));
                    index += 2 * i;
                }
            } else { //首行或者尾行
                while (index < length) {
                    sb.append(s.charAt(index));
                    index += cycle;
                }
            }
        }
        return sb.toString();
    }
}
