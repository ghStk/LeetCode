package n00.demo8;

/**
 * 执行用时 : 2 ms , 在所有 Java 提交中击败了 99.33% 的用户
 * 内存消耗 : 39.6 MB , 在所有 Java 提交中击败了 5.77% 的用户
 */
class Solution {
    public int myAtoi(String str) {
        //空字符串直接返回0
        int length = str.length();
        if (length == 0) return 0;
        int i = 0;
        boolean sign = true;
        int res = 0;
        int maxValue = 7; //INT_MAX_VALUE 的个位数
        //略过所有前缀空格
        while (i < length && str.charAt(i) == ' ') i++;
        if (i > length - 1) return 0;
        //判断首位
        char tmp = str.charAt(i);
        switch (tmp) {
            case '+':
                sign = true;
                maxValue = 7;
                break;
            case '-':
                sign = false;
                maxValue = 8;
                break;
            default:
                if (tmp >= '0' && tmp <= '9') res = (int) tmp - '0';
                else return 0;
        }
        while (i < length - 1) { //判断数字段
            i++;
            int tmp2 = str.charAt(i) - '0';
            if (tmp2 >= 0 && tmp2 <= 9) {
                if (res > 214748364 || (res==214748364 && tmp2 >= maxValue)) return sign ? 2147483647 : -2147483648;
                res = res * 10 + tmp2;
            } else break;
        }
        if (sign) return res;
        else return res * -1;
    }
}