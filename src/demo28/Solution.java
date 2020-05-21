package demo28;

/**
 * 28. 实现 strStr() #easy
 * 执行用时 : 0 ms , 在所有 Java 提交中击败了 100.00% 的用户
 * 内存消耗 : 38 MB , 在所有 Java 提交中击败了 8.69% 的用户
 */
class Solution {
    private String hay;
    private String nd;
    private int ndLength;
    private int hayLength;

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty()) return -1;
        this.hay = haystack;
        this.nd = needle;
        this.ndLength = nd.length();
        this.hayLength = hay.length();
        char match = needle.charAt(0);
        for (int i = 0; i < hayLength; i++) {
            if ((hayLength - i) < ndLength) return -1;
            if (haystack.charAt(i) == match) {
                if (cpr(i)) return i;
            }
        }
        return -1;
    }

    private boolean cpr(int start) {
        for (int i = 1; i < this.ndLength; i++) {
            int tmp = start + i;
            if (tmp >= hayLength) return false;
            if (hay.charAt(tmp) != nd.charAt(i)) return false;
        }
        return true;
    }
}