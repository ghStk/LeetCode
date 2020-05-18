package demo8;

class Solution {
    public int myAtoi(String str) {
        int length = str.length();
        if (length == 0) return 0;
        int i = 0;
        int sign;
        int res = 0;
        while (i < length && str.charAt(i) == ' ') i++;
        if (i > length - 1) return 0;
        char tmp = str.charAt(i);
        switch (tmp) { //判断首位
            case '+':
                sign = 1;
                break;
            case '-':
                sign = -1;
                break;
            default:
                if (tmp >= '0' && tmp <= '9') res = (int) tmp - '0';
                else return 0;
        }
        while (i < length - 1) {
            i++;
            /*
            -----------------------
             */
        }
        return res;
    }
}