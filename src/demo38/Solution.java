package demo38;

/**
 * 执行用时 : 1 ms , 在所有 Java 提交中击败了 98.01% 的用户
 * 内存消耗 : 36.5 MB , 在所有 Java 提交中击败了 5.41% 的用户
 */
class Solution {
    public String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = method(s);
        }
        return s;
    }

    private String method(String s) {
        int length = s.length();
        if (length == 1) return "11";
        int count = 1;
        char pre = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < length; i++) {
            char recent = s.charAt(i);
            if (recent == pre) count++;
            else {
                sb.append(count).append(pre);
                count = 1;
                pre = recent;
            }
        }
        sb.append(count).append(pre);
        return sb.toString();
    }
}
