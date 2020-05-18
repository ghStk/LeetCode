package demo5;

/**
 * 执行用时 : 46 ms , 在所有 Java 提交中击败了 62.08% 的用户
 * 内存消耗 : 37.9 MB , 在所有 Java 提交中击败了 26.78% 的用户
 */
class Solution {
    private String sin;

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length == 0) return "";
        if (length == 2 && s.charAt(0) == s.charAt(1)) return s;
        this.sin = s;
        int mid = 0;
        int max = 1;
        for (int i = 0; i <= length - 2; i++) {
            int tmp = compare(i, i);
            if (max < tmp) {
                max = tmp;
                mid = i;
            }
            if (sin.charAt(i) == sin.charAt(i + 1)) tmp = compare(i, i + 1);
            if (max < tmp) {
                max = tmp;
                mid = i;
            }
        }
        int start, end;
        if (max % 2 == 0) start = mid - max / 2 + 1;
        else start = mid - max / 2;
        end = mid + max / 2;
        return sin.substring(start, end + 1);
    }

    private int compare(int m1, int m2) {
        int res = (m1 == m2 ? 1 : 2);
        while (m1 > 0 && m2 < sin.length() - 1) {
            m1--;
            m2++;
            if (sin.charAt(m1) == sin.charAt(m2)) res += 2;
            else break;
        }
        return res;
    }
}